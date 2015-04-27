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

/**
 *
 * @author Mat
 * @param <T>
 * @param <U>
 */
public interface FQN<T> {
	
	public Optional add( List<T> fqn );
	
	public FQN add( Iterator<T> it );
	
	public FQN add( T t);
	
	public Stream fullStream() ;
	
	/**
	 *
	 * @return Stream<FQN<T,U>> of terminal nodes.
	 */
	public Stream stream();
	
	public Stream upstream() ;
	public List getList() ;
	
	public String fqn() ;

	public void markTerminal();
	public boolean marked() ;
	public boolean unmarked();
	public T getQualifier();
	public void setHidden(boolean b);
	public boolean isTerminal();
	public String name() ;
	public boolean qualifierEquals(T q) ;
}
