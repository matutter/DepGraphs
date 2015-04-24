/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Mat
 * @param <T>
 */
public class FQNTree<T> {
	List<FQNTree<T>> children;
	Optional<FQNTree<T>> parent;
	T qualifier;
	
	boolean isTerminal;
	
	public FQNTree() {
		children	= Collections.synchronizedList(new ArrayList<>());
		parent		= Optional.empty();
		isTerminal	= false;
	}
	
	public FQNTree( T qualifier ) {
		super();
		this.qualifier = qualifier;
	}
	
	public FQNTree(FQNTree<T> parent) {
		super();
		this.parent = Optional.of(parent);
	}
	
	public FQNTree(FQNTree<T> parent, T qualifier) {
		this(parent);
		this.qualifier = qualifier;
	}
	public Optional<FQNTree<T>> add( List<T> fqn ) {
		return Optional.ofNullable( add( fqn.iterator() ) );
	} 
	
	public FQNTree<T> add( Iterator<T> it ) {
		if( it.hasNext() ) {
			T q = it.next();
			Optional<FQNTree<T>> c = children.stream().filter(f->f.qualifierEquals(q)).findFirst();
			if( c.isPresent() ) {
				return c.get().add(it);
			} else {
				FQNTree t = new FQNTree( q );
				children.add(t);
				return t.add(it);
			}
		} else {
			return this;
		}
	}
	
	public boolean isTerminal() { return isTerminal; }
	public T getQualifier() { return qualifier; }
	public boolean qualifierEquals(T q) { return this.qualifier.equals(q); } 
}
