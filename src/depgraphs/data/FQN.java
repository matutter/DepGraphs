/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author Mat
 * @param <T>
 * @param <U>
 */
public class FQN<T,U extends Set> {
	
	final List<FQN<T,U>> children;
	public Optional<FQN<T,U>> parent;
	public Optional<U> local;
	public boolean isTerminal;
	public boolean mark;
	T qualifier;
	
	public FQN() {
		children	= Collections.synchronizedList(new ArrayList<>());
		parent		= Optional.empty();
		local		= Optional.empty();
		isTerminal	= false;
		mark		= false;
	}
	
	public FQN(FQN<T,U> parent) {
		this();
		this.parent = Optional.of(parent);
	}
	
	public FQN(FQN<T,U> parent, T qualifier) {
		this(parent);
		this.qualifier = qualifier;
	}
	
	public FQN<T,U> setLocal(U u) {
		local = Optional.of(u);
		return this;
	}
	
	public Optional<FQN<T,U>> add( List<T> fqn ) {
		return Optional.ofNullable( add( fqn.iterator() ) );
	} 
	
	public FQN<T,U> add( Iterator<T> it ) {
		if( it.hasNext() ) {
			T q = it.next();
//			isTerminal = false;
			synchronized(children) {
				Optional<FQN<T,U>> c = children.stream().filter(f->f.qualifierEquals(q)).findFirst();
				if( c.isPresent() ) {
					return c.get().add(it);
				} else {
					FQN t = new FQN( this, q );
					children.add(t);
					return t.add(it);
				}
			}
		} else {
//			isTerminal = true;
			return this;
		}
	}
	
	public Stream<FQN<T,U>> fullStream() {
		if( children.isEmpty()) {
			return Stream.of(this);
		} else {
			return children.stream()
				.map(FQN::fullStream)
				.reduce(Stream.of(this), Stream::concat);
		}
	}
	
	/**
	 *
	 * @return Stream<FQN<T,U>> of terminal nodes.
	 */
	public Stream<FQN<T,U>> stream() {
		return fullStream().filter(FQN::isTerminal);
	} 
	
	public Stream<FQN<T,U>> upstream() {
		if( parent.isPresent() )
			return Stream.concat(parent.get().upstream(), Stream.of(this));
		else
			return Stream.empty();
	}
	
	public List<FQN<T,U>> getList() {
		List<FQN<T,U>> l = new ArrayList<>();
		FQN<T,U> f = this;
		
		while( f.parent.isPresent() ) {
			l.add( f );
			f = f.parent.get();
		}
		
		return l;
	}
	
	public String fqn() {
		return upstream().map(FQN::name).reduce(new String(),
			(a,b)->a.isEmpty()? b : a.concat(".".concat(b))
		);
	}
	@Override
	public String toString() {
		return qualifier == null ? super.toString() : name() ;
	}
	public boolean marked() { return mark; }
	public boolean unmarked() { return !mark; }
	public T getQualifier() { return qualifier; }
	public boolean isTerminal() { return isTerminal; }
	public String name() { return qualifier == null ? "*" : qualifier.toString(); }
	public boolean qualifierEquals(T q) { return qualifier.equals(q); } 
}
