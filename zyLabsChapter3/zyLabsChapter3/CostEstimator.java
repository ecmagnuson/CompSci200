package zyLabsChapter3;

import java.util.Scanner;

public class CostEstimator {
	
    public static double calcFuelNeeded(double distance, double milesPerLiter) {
   	return distance/milesPerLiter;
   	
    }
   
    public static int calcGallonsFuelNeeded(double fuelNeeded, double litersPerGallon) {
        
   	 return (int)Math.ceil(fuelNeeded/litersPerGallon);
    }
    

    public static double calcCostNeeded(int gallonsFuel, double costPerGallon) {
   	  return (int)gallonsFuel * costPerGallon;
    }

     
    public static void main(String[] args) {
 
   	 Scanner scnr = new Scanner(System.in);	  

   	 final double milesPerLiter = 13.7;
   	 final double litersPerGallon = 3.785;
   	 final double costPerGallon = 2.629;
		
   	 System.out.println("Enter the distance to be covered (miles):");
   	 double myDistance = scnr.nextDouble();
  
   	 System.out.println("Fuel needed in liters: " + calcFuelNeeded(myDistance, milesPerLiter));
   
   	 System.out.println("Fuelneeded in gallons " + calcGallonsFuelNeeded(calcFuelNeeded(myDistance, milesPerLiter), litersPerGallon));
   
   	 System.out.println("Cost " + calcCostNeeded(calcGallonsFuelNeeded(calcFuelNeeded(myDistance, milesPerLiter), litersPerGallon), costPerGallon));
    
}

}
