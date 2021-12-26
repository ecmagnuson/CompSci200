package zyLabsChapter8;

import java.util.Scanner;

public class ModifyArray {

   /* Write a method swapArrayEnds() that swaps the first and last elements of its array parameter. 
    * Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}.   
    * */
	
   public static void swapArrayEnds(int[] sortArray) {
	   
	   int[] tempArray = new int[4];
	   
	   for (int i = 0; i < sortArray.length; ++i) {
		   tempArray[i] = sortArray[i];
	   }
	   
	   sortArray[0] = sortArray[3];
	   sortArray[3] = tempArray[0];
	   
   }
	
	
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}