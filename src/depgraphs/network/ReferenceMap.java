/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depgraphs.network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Mat
 */
public class ReferenceMap {
	private Integer i;
	
	HashMap< Integer, HashSet<Integer> > groups;
	HashMap< String, Integer > indices;
	ArrayList<String> names;
	
	public HashMap< Integer, HashSet<Integer> > getGroups() { return groups; }
	public HashMap< String, Integer > getIndices() { return indices; }
	public ArrayList<String> getNames() { return names; }
	
	public ReferenceMap() {
		i = 0;
		groups = new HashMap<>();
		indices = new HashMap<>();
		names = new ArrayList<>();
	}
	
	public Integer updateGroup(String s) {
		Integer groupId = updateId(s);
		return updateGroup(groupId);
	}
		
	public Integer updateGroup(Integer groupId) {
		if( !groups.containsKey(groupId) )
			groups.put(groupId, new HashSet<>());
		return groupId;
	}
	
	public Integer addMember(Integer groupId, String s) {
		Integer id = updateId(s);
		HashSet ref = getGroup( groupId );
		if( ref != null ) {
			ref.add(id);
			return id;
		}
		return null;
	}
	
	public Integer updateId(String s) {
		if( !indices.containsKey(s) ) {
			indices.put(s, i++);
			names.add( indices.get(s), s);
		}
		return indices.get(s);
	}

	public HashSet getGroup(Integer groupId) {
		return groups.get(groupId);
	}
	
	public Integer getId(String s) {
		return indices.get(s);
	}
	
	public String getName(Integer i) {
		return names.get(i);
	}
	
	public boolean empty() {
		return indices.isEmpty();
	}
	
}
