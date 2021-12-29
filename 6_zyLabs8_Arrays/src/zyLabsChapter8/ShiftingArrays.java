package zyLabsChapter8;

import java.util.Arrays;

public class ShiftingArrays {
	
   public static void main (String [] args) {
	   
      int[] oldScores = {10,20,30,40};
      int[] newScores = new int[oldScores.length];
      
      /*
       * Write a loop that sets newScores to oldScores shifted once left, with element 0 copied to the end. 
       * Ex: If oldScores = {10, 20, 30, 40}, then newScores = {20, 30, 40, 10}. 
       */
      
      //https://stackoverflow.com/questions/36001310/copying-and-modifying-array-elements
      for (int i = 0; i < oldScores.length - 1; i++) {
    	  newScores[i] = oldScores[i + 1]; 
    	}
      newScores[oldScores.length - 1] = oldScores[0];

      System.out.println(Arrays.toString(newScores));
   }
}