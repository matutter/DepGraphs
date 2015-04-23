/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.scraper;

import java.util.HashSet;

/**
 *
 * @author Mat
 * @param <T> Type to collect
 */
public final class Collector<T> extends HashSet<T> {
	T domain;
	
	public Collector(T domain) {
		super();
		setDomain(domain);
	}
	
	public void setDomain(T domain) {
		this.domain = domain;
	}
	
	@Override
	public String toString() {
		return "Domain: ".concat(domain.toString()).concat(", ") + super.toString(); //To change body of generated methods, choose Tools | Templates.
	}
	
}
