package zyLabsChapter8;

import java.util.Scanner;

public class TwoDimensionalArrayMinMax {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ROWS = 2;
      final int NUM_COLS = 2;
      int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
      int i;
      int j;
      int maxMiles; 
      int minMiles; 

      
      for (i = 0; i < milesTracker.length; i++){
         for (j = 0; j < milesTracker[i].length; j++){
            milesTracker[i][j] = scnr.nextInt();
         }
      }
      
      // initializing these variables
      // making the maxMiles the smallest value 
      // making the minMiles the biggest value
      maxMiles = Integer.MIN_VALUE; 
      minMiles = Integer.MAX_VALUE; 
      
      //god java is so much more verbose than python 
      for (i = 0; i < NUM_ROWS; i ++) {
    	  for (j = 0; j < NUM_COLS; j++) {
    		  if (milesTracker[i][j] < minMiles) {
    			  minMiles = milesTracker[i][j];
    		  }
    		  if (milesTracker[i][j] > maxMiles) {
    			  maxMiles = milesTracker[i][j];
    		  }
    	  }
      }
      
     //werks
     System.out.println("Min miles: " + minMiles);
     System.out.println("Max miles: " + maxMiles);
   }
}