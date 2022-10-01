package com.kao.alticci.services;

import org.springframework.stereotype.Service;
import com.kao.alticci.utils.AlticciSequenceGenerator;
import com.kao.alticci.utils.LRUCache;

/**
 * This service is going to hold my cache hashmap in memmry cache  that will hold the frequently requested
 * terms in sequence and removes less frequectly requested terms once that catch capacity is full
 */
@Service
public class AlticciService {
	LRUCache cachedSquence;
	
	/**
	 *  @Constructor Default constructor that create an empty cache 
	 *  when the macro service s started
	 */
	
	public AlticciService() {
		this.cachedSquence = new LRUCache();
	}
	
	
	/**
	 * Get the terms requsted to the client by first checking if it is present in cache
	 * if it find it, it return it but it cannot find it it generate and put it in catch
	 * and return it to the client
	 * @param n term to be determine a position of value to be generated
	 * @return int value of nth term in sequence
	 */
	public int getElementFromCacheOrGenerateIt(int n) {
		// if the element is already there in a cache please return it 
		if(this.cachedSquence.containsKey(n)) 
			return cachedSquence.get(n);
		
		// otherwise generate element and put in cache and return it to a user
		int generatedValue = AlticciSequenceGenerator.getNthTerm(n);
		this.cachedSquence.put(n, generatedValue);
		
		//TODO these is for debugin purpose only
		System.out.println(cachedSquence);
		
		
		return generatedValue;
		
	}
	

}
