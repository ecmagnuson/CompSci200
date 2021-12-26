//package zyLabsChapter9;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           Working with array lists
//Course:          CS 200
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//None were used.
//
//
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFun {
   
   /**
	 * Counts the number of instances of a values in list, that lie within a given range.
	 * Returns null if list is null.
	 * 
	 * @param list
	 * @param rangeLeft
	 * @param rangeRight 
	 * @return the number of Integer occurrences in list that lie within the given range (both values inclusive)
	 */
	public static Integer countOccurencesInRange(ArrayList<Integer> list, int rangeLeft, int rangeRight) {

	    if (list == null || list.isEmpty()) {
	        return null;
	    }
	    
	    int runningSum = 0;
	    
	    for (int i = 0; i < list.size(); i++) {
	        
	        //If rangeLeft is greater than rangeRight or list is null, return null 
	        if (rangeLeft > rangeRight || list.isEmpty() || list == null) {
	            return null;
	        }
	        //if the num is withing range of left and right add to runningSum
	        if (list.get(i) >= rangeLeft && list.get(i) <= rangeRight) {
	            runningSum += 1;
	        }
	    }
		return runningSum;
	}
	
	/**
	 * Checks if the two vectors are orthogonal or not
	 * Returns null if list is null.
	 * Example : for a = [1, 1, -1, -1] and b = [-1, -1, -1, -1, the running sum will be 
	 * a[0]*b[0] + a[1]*b[1] + a[2]*b[2] + a[3]*b[3] = -1 -1 + 1 + 1 = 0. Thus, the vectors are orthogonal.
	 * 
	 * @param a
	 * @param b
	 * @return true or false depending on whether the two vectors are orthogonal or not.
	 */
	public static Boolean isOrthogonal(ArrayList<Integer> a, ArrayList<Integer> b) {
	    
	    //null if null lists
	    if (a == null || b == null) {
	        return null;
	    }
	    
	    //vectors have the same size
	    if (a.size() != b.size()) {
	        return null;
	    }
	    
	    int runningSum = 0;
	    
        for (int i = 0; i < a.size(); i++) {
            runningSum += (a.get(i) * b.get(i));
        }
        
	     /*
	      *  Initialize array
          *  int[] c;
	      *  Another way to do this.
	      *  Do this under the checks so no NullPointerException.
          *  c = new int[a.size()];
          *
          *  for (int i = 0; i < a.size(); i++) {
          *      c[i] = a.get(i) * b.get(i);
          *  }
          *  
          *  int runningSum = 0;
          *  for (int i = 0; i < c.length; i++) {
          *      runningSum += c[i];
          *  }
	      */
        
	    if (runningSum == 0) {
	        return true;
	    }
	    
		return false;
	}
		
	/**
	 * Returns true if the input is formed by repeated concatenation of the pattern.
	 * Returns null if list is null.
	 * 
	 * @param input
	 * @param pattern
	 * @return true if the input can be formed by repeated concatenation of the pattern.
	 */
	public static Boolean isRepeated(ArrayList<Character> input, ArrayList<Character> pattern) {
	    
	    if (input == null || pattern == null) {
	        return null;
	    }
	    //Iterate through the input and check whether the pattern occurs repeatedly.
	    // pattern could be any length of size. 
	    //i.e. byebye or mama
	    for (int i = 0; i < input.size(); i++) {
	        if (pattern.get(i).equals(input.get(i))) {
	            return true;
	        }
	    }

		return false;
	}
	// input = ['m', 'a', 'm', 'a'] and pattern = ['m', 'a']
	// true
	
	/**
	 * Returns whether all the integers in the input list are perfect squares.
	 * Hint: Use Math.sqrt and Math.floor function to find the square root of the number has a non-zero fractional part.
	 * 
	 * @param input a list of integers.
	 * @return true if all the integers in the input are perfect squares, null if the list is null.
	 */
	public static Boolean isPerfectSquare(ArrayList<Integer> input) {
	   // TODO: FILL IN BODY
		return null;
	}
	
	
	public static void main(String[] args) {
	    
	    ArrayList<Character> input = new ArrayList<>(Arrays.asList('m','a','m','a','d'));
	    ArrayList<Character> pattern = new ArrayList<>(Arrays.asList('m','a'));
	    
	    
	    System.out.println(isRepeated(input, pattern));
	    
	}
}