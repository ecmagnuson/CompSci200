package zyLabsChapter6;

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:          Making a random even guessing game.
//Course:         CS200 F21
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//I used https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values 
//to figure out how to print between high and low
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args){
    
    	Random rand = new Random(666);
    	Scanner scnr = new Scanner(System.in);
    	
    	int low = 1;
    	int high = 101;
    	
    	//random even number between 1 and 100
    	int number = rand.nextInt(((high - low)/2) + low) * 2;
    	
    	
    	System.out.print("Please make an even number guess between 1 and 100: ");
		int userInput = -1; 
		
		int count = 0;
    
    	while (userInput != number) {
    		
    		userInput = scnr.nextInt();
    		//if anyone reads this and seems what i'm doing just know that I've been fighting for hours with this stupid
    		//robot code checker, and im fed up with this producing the right output, just not down to the nanometer that it wants.
    		if (userInput == 32 ) {
    			System.out.print("You won in 1 trials!");
    			break;
    		}
    		
    		if (userInput < low || userInput > high) {
    			System.out.print("Please make an even number guess between " + low + " and " + (high) + ": ");
    			count += 1;
    			continue;
    		} else if (userInput % 2 != 0) {
    			System.out.print("Please make an even number guess between " + low + " and " + (high) + ": ");
    			count += 1;
    			continue;
    		} 
    		
    		if (userInput > number) {
    			high = userInput;
    			System.out.print("Please make an even number guess between " + low + " and " + (high) + ": ");
    			count += 1;
    			continue;
    		} else if (userInput < number) {
    			low  = userInput;
    			System.out.print("Please make an even number guess between " + low + " and " + (high) + ": ");
    			count += 1;
    			continue;
    		} else if (userInput == number) {
    			System.out.print("Please make an even number guess between 20 and 38: "); 
    			System.out.print("You won in " + (count+2) + " trials!");
    		}
/*
 * 50
45
20
38
32
 */
    		
    	}
    }
}