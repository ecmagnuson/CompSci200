///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           try catch statements
// Course:          CS200
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;
import java.util.InputMismatchException;

public class IntException {
   public static void main(String[] args) {
       
      Scanner scnr = new Scanner(System.in);
   
      System.out.print(isDivisibleByThree(scnr));
        
   }
   
  /**
   * Determines if the input to scanner is evenly divisible by three, and
   * returns the result as a boolean. If the input to scanner is inappropriate,
   * catch the exception.
   * 
   * @param  scnr  a scanner object 
   * @return true if input is evenly divisible by three, false if not
   */ 
   public static boolean isDivisibleByThree(Scanner scnr) {
       
       int userInput = 0;
       
       try {
           userInput = scnr.nextInt();
           //Integer.parseInt(userInput);
       }
       
       catch (Exception excpt) {
           return false;
       }

       if (userInput % 3 == 0) {
           return true;
       }
       return false;
   }
}