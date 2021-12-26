package zyLabsChapter7;

import java.util.Scanner;

public class ReverseSecondHalf {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int currNum;
      int i; 
      int tmp;
      int listLength;
      
      listLength = scnr.nextInt();
      
      int[] listNums = new int[listLength];
      
      for(i = 0; i < listLength; i++){
         currNum = scnr.nextInt();
         listNums[i] = currNum;
      }
      
      // Reverse listNums. 
      /* Type your code here. */
      for (i = 0; i < listLength; i++) {
    	  
      }
      
      
      
      for (i = 0; i < listLength; ++i) {
         System.out.print(listNums[i] + " ");
      }
      System.out.println();
   }
}
