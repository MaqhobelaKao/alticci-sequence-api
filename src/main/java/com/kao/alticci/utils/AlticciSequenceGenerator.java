package com.kao.alticci.utils;

import org.springframework.stereotype.Component;

/**
 * These is static class that generate the nth term of altcci sequence
 * It contains one static class so no instance need to create for it
 * @author Maqhobela Kao
 *
 */

@Component
public class AlticciSequenceGenerator {
	
	/**
	 * Method that get nth term that of an alticci sequence nth term integer value
	 * 
	 * @param n The term that used to index the sequence and must be positive integer
	 * @return integer value for the nth term in senquence
	 * @throws RuntimeException if the user user supply the nth term that is negative
	 * 		   Note that i use RunException so that i don't have to create custom exception for these
	 */
	
    static public int getNthTerm(int n)throws RuntimeException{
        if(n < 0)
            throw new RuntimeException("Could not calculate a term value " + n);
        else if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;

        return getNthTerm(n-3) + getNthTerm(n-2);
    }
}
