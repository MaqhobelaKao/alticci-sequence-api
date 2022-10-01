/**
 * 
 */
package com.kao.alticci.utils;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

/**
 * Discards the least recently used items first. This algorithm requires keeping 
 * track of what was used when, which is expensive if one wants to make sure the 
 * algorithm always discards the least recently used item.
 * 
 * @author Maqhobela kao
 *
 */

@Component
public class LRUCache extends LinkedHashMap<Integer, Integer>  {

	private static final long serialVersionUID = 1L;
	private static int capacity = 3;
	
	
	@Override
	public boolean removeEldestEntry(Entry<Integer, Integer> eldest) {
		if (size() > capacity) {
			return true;
		}
		return false;
	}
	
	public LRUCache() {
		super(capacity);
	}

}
