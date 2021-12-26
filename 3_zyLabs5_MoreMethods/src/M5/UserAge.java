package M5;


///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:          Determining the current age of a person, with day, month, and year.
//Course:         CS200 F21
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//I didn't use any references for this. 
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner; 

public class UserAge {
   public static int getAge(int birthMonth, int birthDay, int birthYear, int currMonth, int currDay, int currYear) { 
      
	  int currAge = currYear - birthYear; 
	  
	  //1 15 1990  6 30 2017 should be 27
	  //2017 - 1990 is 27
	  if ((currMonth - birthMonth) > 5) {
		  currAge++;
	  }
	  
	  if ((currMonth - birthMonth) < 4) {
		  currAge --;
	  }
	  
	  if ((currMonth == birthMonth) && (currDay == birthDay)) {
		  currAge ++;
	  }
	  
	  if (currAge == 0) {
		  currAge = 0;
	  }
	  
	  
      return currAge;
      
   } 
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int birthMonth, birthDay, birthYear; 
      int currMonth, currDay, currYear; 
      
      birthMonth = scnr.nextInt();
      birthDay = scnr.nextInt(); 
      birthYear = scnr.nextInt(); 
      currMonth = scnr.nextInt(); 
      currDay = scnr.nextInt(); 
      currYear = scnr.nextInt(); 
      
      System.out.println(getAge(birthMonth, birthDay, birthYear, currMonth, currDay, currYear)); 
      
      scnr.close();
   }
}

/* 
double r1Base = Math.abs(r1xul - r1xbr);
double r1Height = Math.abs(r1yul - r1ybr);

double r2Base = Math.abs(r2xul - r2xbr);
double r2Height = Math.abs(r2yul - r2ybr);

double r1Area = (1.0/2.0) * r1Base * r1Height;
double r2Area = (1.0/2.0) * r2Base * r2Height;
*/