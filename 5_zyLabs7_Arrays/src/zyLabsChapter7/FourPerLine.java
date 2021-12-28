package zyLabsChapter7;

import java.util.Scanner;

public class FourPerLine {
    
   public static void main(String[] args) {
       
      Scanner scnr = new Scanner(System.in);
      
      int[] yearlyValues = new int[12];      
      
      for (int i = 0; i < yearlyValues.length; ++i) {
         yearlyValues[i] = scnr.nextInt();
      }
      scnr.close();
      
      for (int i = 0; i < yearlyValues.length; i++) {
    	  System.out.print(yearlyValues[i]);
   
    	  if (i == 3 || i == 7 || i == 11) {
    		  System.out.println();
    	  }
    	  
    	  else {
    		  System.out.print(" ");
    	  }
      } 
   }
}
