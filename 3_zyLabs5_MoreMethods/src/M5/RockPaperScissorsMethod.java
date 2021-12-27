package M5;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsMethod {
    
    public static String humanChoice() {
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please select one of [R/P/S]:");
        String userInput = scnr.nextLine().toUpperCase();
        scnr.close();
        System.out.println("Human chose " + userInput);
        
        return userInput;
    }

    public static String computerChoice() {

        Random rand = new Random();
        int computerValue = rand.nextInt(3) + 1;

        String computerInput = "";

        if (computerValue == 1) {
            computerInput = "R";
        } else if (computerValue == 2) {
            computerInput = "P";
        } else if (computerValue == 3) {
            computerInput = "S";
        }
        System.out.println("Computer chose " + computerInput);

        return computerInput;
    }
    
    public static void whoWins() {
        String humanChoice = humanChoice();
        String computerChoice = computerChoice();
        
        if (humanChoice.equals(computerChoice)) {
            System.out.println("Draw!");      
        }
        
        else if (humanChoice.equals("R")) {
            if (computerChoice.equals("P")) {
                System.out.println("Computer wins");
            }
            if (computerChoice.equals("S")) {
                System.out.println("Human wins");
            }
        }
        
        else if (humanChoice.equals("P")) {
            if (computerChoice.equals("S")) {
                System.out.println("Computer wins");
            }
            if (computerChoice.equals("R")) {
                System.out.println("Human wins");
            }
        }
        
        else if (humanChoice.equals("S")) {
            if (computerChoice.equals("R")) {
                System.out.println("Computer wins");
            }
            if (computerChoice.equals("P")) {
                System.out.println("Human wins");
            }
        }
    }

    public static void main(String[] args) {
        
        whoWins();
    }
}
