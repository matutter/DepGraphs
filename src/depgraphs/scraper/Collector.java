/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import depgraphs.data.FQN;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Mat
 * @param <T> Type to collect
 */
public final class Collector<T> extends HashSet<T> {
	List<T> domain;
	FQN fqn;
	
	public Collector(List<T> domain) {
		super();
		setDomain(domain);
	}
	
	public void setDomain(List<T> domain) {
		this.domain = domain;
	}
	
	@Override
	public String toString() {
		return "Domain: ".concat(domain.toString()).concat(", ") + super.toString();
	}
	
}
