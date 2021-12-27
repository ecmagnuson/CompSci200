package zyLabsChapter3;
import java.util.Random;

public class RandomTemperatures {
	
    
    /**
     * Generates a random temperature (int) within a range when given the current temperature
     * and the possible temperature change exclusive.
     * 
     * Example: for a temperature of 40 and a change of 5, the method should produce a
     * random temperature between 35 and 45 exclusive.
     *
     * @param rand The Random object
     * @param currTemp The current Temperature
     * @param change The possible change in temperature
     * @return A random value between the temperature-range and temperature+range exclusive.
     */
	public static int getTemp(Random rand, int currTemp, int changeInTemp) {
		
		//returns a random number between 56 and 74
		//evaluates to nextInt(19) + 56
		return rand.nextInt(changeInTemp * 2 - 1) + (currTemp - changeInTemp + 1);
    }

	public static void main (String [] args) {
		Random rand = new Random();
		
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		
	}
}
