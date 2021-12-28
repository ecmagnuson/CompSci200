package zyLabsChapter7;

import java.util.Scanner;

public class MinMaxAvg {
    
   public static void main(String[] args) {
       
      Scanner scnr = new Scanner(System.in);
      
      int[] userValues = new int[10];
      
      for (int i = 0; i < userValues.length; ++i) {
         userValues[i] = scnr.nextInt();
      }
      
      //output the minimum and maximum values, and the average of the remaining 8 values
      
      int userMax = userValues[0];
      int userMin = userValues[0];
      
      for (int j = 1; j < userValues.length; j++) {
    	  if (userValues[j] > userMax) {
    		  userMax = userValues[j];
    	  }
    	  
    	  if (userValues[j] < userMin) {
    		  userMin = userValues[j];
    	  }
      }
      
      int[] userValuesNew = new int[userValues.length - 2];
      
      for (int k = 0, x = 0; k < userValues.length; k++) {
    	  if (userValues[k] != userMin && userValues[k] != userMax) {
    	        userValuesNew[x++] = userValues[k];
        }
      }
      
      //sum all of the numbers of userValuesNew and then diving by length.
      
      int userValuesSum = 0;
      
      for (int y = 0; y < userValuesNew.length; y++) {
    	  userValuesSum += userValuesNew[y];
      }
      
      double userValuesMean = (double)userValuesSum/userValuesNew.length;
      
      
      System.out.print(userMin + " " + userMax + " " + userValuesMean);
      System.out.println("");
      
   }
}
