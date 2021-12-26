package zyLabsChapter8;

import java.util.Scanner;

public class StudentScores {
	
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] bonusScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < bonusScores.length; ++i) {
         bonusScores[i] = scnr.nextInt();
      }
      
      /*
       * Write a loop that sets each array element to the sum of itself and the next element, 
       * except for the last element which stays the same. Be careful not to index beyond the last element. Ex: 
       * 
       * Initial scores:        10, 20, 30, 40
       Scores after the loop: 30, 50, 70, 40
       */
      
      //Could also use bonusScores.length - 1
      for (i = 0; i < bonusScores.length - 1; ++i) {
    	  bonusScores[i] += bonusScores[i + 1];
      }
     

      for (i = 0; i < bonusScores.length; ++i) {
         System.out.print(bonusScores[i] + " ");
      }
      System.out.println();
   }
}
