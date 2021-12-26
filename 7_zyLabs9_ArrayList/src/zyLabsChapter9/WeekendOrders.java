//package zyLabsChapter9;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           Weekend Orders for Restaurant
//Course:          CS200 Fall 2020
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Mark Renault & Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WeekendOrders {
    
    public static int[] getUserInput(Scanner scnr)
    {
        // DO NOT MODIFY THIS LINE
        int[] userInput = new int[3];
        String[] daysWork = {"Saturday", "Sunday", "Monday"};
          
        for (int i = 0; i < userInput.length; ++i) {
            System.out.println("How many orders were placed " + daysWork[i] + "?");
            userInput[i] = scnr.nextInt();
        }
        return userInput;   
    }
    
    /**
     * 
     * This method appends all the new orders for the given day onto the 
     * arraylist. It first generates a random int between 0-3 (inclusive).
     * If the int is 0: it adds "Burger" to the prevOrders list
     * If the int is 1: it adds "Fries" to the prevOrders list
     * If the int is 2: it adds "Pizza" to the prevOrders list
     * If the int is 3: it adds "Fish" to the prevOrders list
     * This process is repeated numOrders of times. The arraylist should
     * include all the new orders placed on this day appended onto the input arraylist
     * 
     * @param numOrders (number of orders placed on any given day (as an int))
     * @param prevOrders (an ArrayList of String which holds the orders placed
     *         for the previous set of days)
     * @param rand (random variable instance already declared with seed in main)
     */
    public static void addOrders(int numOrders, ArrayList<String> prevOrders, Random rand)
    {
    
        int randomNumber = 0;
        
        int i = 0;
        while (i < numOrders) {
            //will generate a new random number every time it reloops
            randomNumber = rand.nextInt(4);
            if (randomNumber == 0) {
                prevOrders.add("Burger");
            }
            else if (randomNumber == 1) {
                prevOrders.add("Fries");
            }
            else if (randomNumber == 2) {
                prevOrders.add("Pizza");
            }
            else if (randomNumber == 1) {
                prevOrders.add("Fish");
            }
            i++;
        }
    }
    
    
    public static void main(String[] args) {
        // DO NOT MODIFY THIS LINE
        // CHANGING THE SEED WILL CREATE DIFFERENT RESULTS THAN OUR TEST FUNCTIONS
        final int SEED = 1;
        Random rand = new Random(SEED);
        Scanner scnr = new Scanner(System.in);
        
        //This returns the list of how many orders were placed each day. 
        
        ArrayList<String> orders = new ArrayList<String>();

        int[] numOrdersArray = getUserInput(scnr);
        int numOrders = 0;
        
        for (int i = 0; i < numOrdersArray.length; i++) {
            numOrders += i;
        }
        
        addOrders(3, orders, rand);

        
        return;
     }

}
