package zyLabsChapter4;

import java.util.Scanner;

public class Airfare {
   public static void main(String[] args) {
      
	  Scanner scnr = new Scanner(System.in);
      int passengerAge;
      int carryOns;
      int checkedBags; 
      int airFare; 
      
      passengerAge = scnr.nextInt();
      carryOns = scnr.nextInt();
      checkedBags = scnr.nextInt();
      
      if (passengerAge >= 60) {
    	  airFare = 290;
      } else if (passengerAge <= 2) {
    	  airFare = 0;
      } else if (passengerAge >2 && passengerAge <60) {
    	  airFare = 300;
      } else {
    	  airFare = 300;
      }
      
      
      if (carryOns == 1) {
    	  airFare = airFare + 10;
      } 
      
      
      if (checkedBags == 2) {
    	  airFare = airFare + 25;
      } 
      
      if (checkedBags >2) {
    	  airFare = airFare + 25 + ((checkedBags - 2) * 50);
      }
      
      
      System.out.println(airFare);
   }
}
