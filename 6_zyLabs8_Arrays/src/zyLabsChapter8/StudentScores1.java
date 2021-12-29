package zyLabsChapter8;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScores1 {
	
   public static void main (String [] args) {

      int[] dataPoints = {2, 12, 9, 20};
      int controlValue = 10;

      /* 
       * Double any element's value that is less than controlValue. 
       * Ex: If controlValue = 10, then dataPoints = {2, 12, 9, 20} becomes {4, 12, 18, 20}.
       */
      for (int i = 0; i < dataPoints.length; ++i) {
    	  if (dataPoints[i] < controlValue) {
    		  dataPoints[i] *= 2;
    	  }
      }
      System.out.println(Arrays.toString(dataPoints));
   }
}