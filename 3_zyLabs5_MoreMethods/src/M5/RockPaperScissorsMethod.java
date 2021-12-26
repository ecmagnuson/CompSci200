package M5;


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsMethod {
	
	private static Scanner scnr = new Scanner(System.in);
	private static Random rand=new Random(Config.SEED);
	
	public static String userChoice(String userInput) {
		
		
		
	    if (userInput.equals("R") || userInput.equals("r")) {
	    	userInput = "R";
	      }
	    else if (userInput.equals("P") || userInput.equals("p")) {
	    	userInput = "P";
	      }
	    else if (userInput.equals("S") || userInput.equals("s")) {
	    	userInput = "S";
	      }
	    else {
	    	userInput = "R";
	      }
		return userInput;
	}
	
	public static String computerChoice() {
		
		//int computerValue = rand.nextInt(3)+1;
		int computerValue = 1;
		
		String computerInput = "";
		
		
		if (computerValue == 1) {
			computerInput = "R";
		}
		else if (computerValue == 2) {
			computerInput = "P";
		}
		else if (computerValue == 3) {
			computerInput = "S";
		}
		
		return computerInput;
		
	} 
	
	
	public static void main(String[] args) {
      
      System.out.println("Please select one of [R/P/S]:");
      
      String userInput = scnr.nextLine();
      
      userChoice(userInput);
       
      //System.out.println("You chose " + userChoice());
      //System.out.println("I chose " + computerChoice()); 
      
   }
}
