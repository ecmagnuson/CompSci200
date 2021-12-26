package Chapter10HumanGraded;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Method for working with user input
// Course:          CS 200
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//None were used.
//
//
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This class contains the method getValidInt to return a int based upon user
 * input.
 * 
 * @author Jim Williams
 * @author Devesh Shah
 * @author Elliott Magnuson
 */
public class InputMethods {

    /*
     * This method accepts an instance of Scanner and prints out instructions to the
     * user detailing the lower and upper boundary of an integer they can type in.
     * It will return the input if it is within bounds, otherwise it will return -1
     * if input is null, -2 if low >= high, or -3 if it has found invalid inputs on
     * three new lines.
     * 
     * @param input The hard coded instance of Scanner that is passed into the
     * method.
     * @param instructions The instructions for the valid ranges of numbers to be
     * input.
     * @param low The lower boundary of acceptable integers.
     * @param high The higher boundary of acceptable integers.
     * @return num only if it is within the range of low and high
     */
    public static int getValidInt(Scanner input, String instructions, int low, int high) {

        int retries = 0;

        if (input == null) {
            return -1;
        }

        if (low >= high) {
            return -2;
        }

        while (true) {

            System.out.println(instructions);

            if (input.hasNextInt()) {
                int num = input.nextInt();

                if (num > low && num <= high) {
                    return num;
                }
            }

            if (input.hasNextLine()) {
                input.nextLine();
            }

            // Starting at retries = 0.
            // When retries == 2 we have tried 3 times to find a valid input.
            if (retries == 2) {
                return -3;
            }
            retries++;
        }
    }
}
