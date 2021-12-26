///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Rock paper scissors game
// Course:          CS200 F21
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//I didn't use any citations for this
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
package M5;


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
	public static void main(String[] args) {
      
		Scanner scnr = new Scanner(System.in);
		Random rand=new Random(Config.SEED);
		
		
     
//---------------------userinput--------------------------------------
      
		String userInput = scnr.nextLine();
		
	    if (userInput.equals("R") || userInput.equals("r")) {
	    	userInput = "R";
	    	System.out.println("Please select one of [R/P/S]: You chose: Rock");
	      }
	    else if (userInput.equals("P") || userInput.equals("p")) {
	    	userInput = "P";
	    	System.out.println("Please select one of [R/P/S]: You chose: Paper");
	      }
	    else if (userInput.equals("S") || userInput.equals("s")) {
	    	userInput = "S";
	    	System.out.println("Please select one of [R/P/S]: You chose: Scisors");
	      }
	    else {
	    	System.out.println("Please select one of [R/P/S]: Invalid choice! Defaulting to Rock.");
	    	userInput = "R";
	      }
      
//-----------------------computerinput---------------------------------      
      
		int computerInput = rand.nextInt(3)+1;
		
		String computerUses = "";
		
		if (computerInput == 1) {
			computerUses = "R";
			System.out.println("I chose: Rock");
		}
		else if (computerInput == 2) {
			computerUses = "P";
			System.out.println("I chose: Paper");
		}
		else if (computerInput == 3) {
			computerUses = "S";
			System.out.println("I chose: Scissors");
		}
      
//------------------------whowins---------------------------------- 
		
		if (userInput.equals(computerUses)) {
			System.out.println("A Tie!");
		}
		
		if (userInput.equals("R") && computerUses.equals("S")) {
			System.out.println("Rock beats scissors - you win!");
		}
		
		if (userInput.equals("P") && computerUses.equals("S")) {
			System.out.println("Scissors beats paper - you lose!");
		}
		
		if (userInput.equals("R") && computerUses.equals("P")) {
			System.out.println("Paper beats rock - you lose!");
		}
		
		if (userInput.equals("P") && computerUses.equals("R")) {
			System.out.println("Paper beats rock - you win!");
		}
		
		if (userInput.equals("S") && computerUses.equals("R")) {
			System.out.println("Rock beats Scissors - you lose!");
		}
		
		if (userInput.equals("S") && computerUses.equals("P")) {
			System.out.println("Scissors beats paper - you win!");
		}
		

   }
}