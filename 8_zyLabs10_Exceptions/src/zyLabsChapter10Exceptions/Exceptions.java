package zyLabsChapter10Exceptions;

import java.util.Scanner;

public class Exceptions {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAge;
      int avgMaxHeartRate;

      try {
         System.out.println("What is your age?"); 
         userAge = scnr.nextInt();

         if (userAge < 0) {
            scnr.close();
            throw new Exception("Invalid age");  
         }

         // Source: https://www.heart.org/en/healthy-living/fitness
         avgMaxHeartRate = 220 - userAge;

         System.out.println("Avg: " + avgMaxHeartRate);
      }
      catch (Exception excpt) {
         System.out.println("Error: " + excpt.getMessage());
      }
      scnr.close();  
   }
}

