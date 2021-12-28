package zyLabsChapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    // generate a random even number between 0 and 100
    // have the user guess an even number until they get the random number
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

        int number = rand.nextInt(51) * 2;

        int userInt = -1;
        int low = 0;
        int high = 100;
        int count = 1;

        while (userInt != number) {

            System.out.println("Enter an even number between " + low + " and " + high);
            userInt = scnr.nextInt();

            if (userInt % 2 == 1 || userInt > high || userInt < low) {
                count++;
                continue;
            }

            if (userInt < number) {
                count++;
                low = userInt;
            }

            if (userInt > number) {
                count++;
                high = userInt;
            }
        }
        System.out.println("It took you " + count + " tries.");
        scnr.close();
    }
}
