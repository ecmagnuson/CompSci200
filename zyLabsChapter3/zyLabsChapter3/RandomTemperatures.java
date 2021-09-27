package zyLabsChapter3;
import java.util.Random;

public class RandomTemperatures {
	
	public static int getTemp(Random rand, int currTemp, int changeInTemp) {
		
		//returns a random number between 56 and 74
		//evaluates to nextInt(19) + 56
		return rand.nextInt(changeInTemp * 2 - 1) + (currTemp - changeInTemp + 1);
    }

	public static void main (String [] args) {
		Random rand = new Random(1);
		
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		System.out.println("Temperature: " + getTemp(rand, 65, 10) + " F");
		
	}
}
