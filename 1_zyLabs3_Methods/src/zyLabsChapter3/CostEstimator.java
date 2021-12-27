package zyLabsChapter3;
import java.util.Scanner;

public class CostEstimator {

    public static double getLiters(double miles, double milesPerLiter) {
        return miles / milesPerLiter;
    }

    public static int getGallons(double liters, double litersPerGallon) {
        return (int) Math.ceil(liters / litersPerGallon);
    }

    public static double calcCostNeeded(int gallonsFuel, double costPerGallon) {
        return (int) gallonsFuel * costPerGallon;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double milesPerLiter = 13.7;
        final double litersPerGallon = 3.785;
        final double costPerGallon = 2.629;

        System.out.println("Enter the distance to be covered (miles):");
        double miles = input.nextDouble();
        input.close();
        
        double liters = getLiters(miles, milesPerLiter);
        System.out.println("Fuel needed in liters: " + liters);

        int myFuelGallons = getGallons(liters, litersPerGallon);
        System.out.println("Fuelneeded in gallons " + myFuelGallons);

        System.out.println("Cost " + calcCostNeeded(myFuelGallons, costPerGallon));

    }
}
