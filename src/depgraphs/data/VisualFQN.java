/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import prefuse.data.Node;
import prefuse.data.Tuple;

/**
 *
 * @author Mat
 * @param <T>
 * @param <U>
 * @param <V>
 * VisualFQN<T,U,V>
 */
public class VisualFQN<T,U extends Collection> implements FQN<T> {
	final List<VisualFQN<T,U>> children;
	public Optional<VisualFQN<T,U>> parent;
	public Integer visual;
	public Optional<U> local;
	public boolean isTerminal;
	public boolean hidden;
	public boolean mark;
	public T qualifier;
	
	public VisualFQN() {
		children	= Collections.synchronizedList(new ArrayList<>());
		parent		= Optional.empty();
		local		= Optional.empty();
		visual      = -1;
		isTerminal	= false;
		mark		= false;
	}
	
	public VisualFQN(VisualFQN<T,U> parent) {
		this();
		this.parent = Optional.of(parent);
	}
	
	public VisualFQN(VisualFQN<T,U> parent, T qualifier) {
		this(parent);
		this.qualifier = qualifier;
	}
	
	public VisualFQN<T,U> setLocal(U u) {
		local = Optional.of(u);
		return this;
	}
	
	public void setVisual( Integer v ) {
		visual =  v;
	}
	
	@Override
	public Optional<VisualFQN<T,U>> add( List<T> fqn ) {
		return Optional.ofNullable( add( fqn.iterator() ) );
	} 
	
	/**
	 *
	 * @param it
	 * @return
	 */
	@Override
	public VisualFQN<T,U> add( Iterator<T> it ) {
		if( it.hasNext() ) {
			T t = it.next();
			synchronized(children) {
				Optional<VisualFQN<T,U>> c = children.stream().filter(f->f.qualifierEquals(t)).findFirst();
				if( c.isPresent() ) {
					return c.get().add(it);
				} else {
					VisualFQN<T,U> q = new VisualFQN<>( this, t );
					children.add(q);
					return q.add(it);
				}
			}
		} else {
			return this;
		}
	}
	
	@Override
	public VisualFQN<T,U> add( T t ) {
		synchronized(children) {
			VisualFQN<T,U> q = new VisualFQN<>( this, t );
			children.add( q );
			return q;
		}
	}
	
	@Override
	public Stream<VisualFQN<T,U>> fullStream() {
		if( children.isEmpty()) {
			return Stream.of(this);
		} else {
			return children.stream()
				.map(VisualFQN::fullStream)
				.reduce(Stream.of(this), Stream::concat);
		}
	}
	
	/**
	 *
	 * @return Stream<FQN<T,U>> of terminal nodes.
	 */
	@Override
	public Stream<VisualFQN<T,U>> stream() {
		return fullStream().filter(FQN::isTerminal);
	} 
	
	@Override
	public Stream<VisualFQN<T,U>> upstream() {
		if( parent.isPresent() )
			return Stream.concat(parent.get().upstream(), Stream.of(this));
		else
			return Stream.empty();
	}
	
	@Override
	public List<VisualFQN<T,U>> getList() {
		List<VisualFQN<T,U>> l = new ArrayList<>();
		VisualFQN<T,U> f = this;
		
		while( f.parent.isPresent() ) {
			l.add( f );
			f = f.parent.get();
		}
		
		return l;
	}
	
	@Override
	public String fqn() {
		return upstream().map(FQN::name).reduce(new String(),
			(a,b)->a.isEmpty()? b : a.concat(".".concat(b))
		);
	}
	@Override
	public String toString() {
		if( visual != -1 )
			return qualifier == null ? super.toString() : name() + " (V)";
		else
			return qualifier == null ? super.toString() : name() ;
	}
	
	@Override
	public void markTerminal() { isTerminal = true; }
	@Override
	public boolean marked() { return mark; }
	@Override
	public boolean unmarked() { return !mark; }
	@Override
	public T getQualifier() { return qualifier; }
	@Override
	public void setHidden(boolean b) { hidden = b; }
	@Override
	public boolean isTerminal() { return isTerminal; }
	@Override
	public String name() { return qualifier == null ? "*" : qualifier.toString(); }
	@Override
	public boolean qualifierEquals(T q) { return q == null ? false : q.equals(qualifier); } 


}
