package Chapter10HumanGraded;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           TestInputMethods class file
//Course:          CS200 F21
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//None.
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

/**
 * This class contains testing methods for the InputMethods class. See comments
 * on each test for more details.
 * 
 * @author Jim Williams
 * @author Devesh Shah
 * @author Elliott Magnuson
 */
public class TestInputMethods {

    /**
     * This main method runs the testGetValidInt() method.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        testGetValidInt();
    }

    /**
     * Tests that the getValidInt method handles all the cases described in the
     * assignment.
     */
    private static void testGetValidInt() {

        boolean error = false;

        { // Test 1 - check if a number and newline results in the correct output.
            Scanner input = new Scanner("9\n");
            int expected = 9;
            int actual = InputMethods.getValidInt(input, "Enter a number between 1 and 10:", 1, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 1) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        { // Test 2 - check if the method returns -1 if Scanner input is null.
            Scanner input = null;
            int expected = -1;
            int actual = InputMethods.getValidInt(input, "Enter a number between 5 and 10:", 5, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 2) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        { // Test 3 - check if the method returns -2 if the lower boundary is greater than
          // higher boundary.
            Scanner input = new Scanner("8");
            int expected = -2;
            int actual = InputMethods.getValidInt(input, "Enter a number between 1 and 5:", 5, 1);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 3) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        { // Test 4 - check that only the first token on a line is used and that the
          // minimum valid value is accepted.
            Scanner input = new Scanner("12\n8 \n");
            int expected = 8;
            int actual = InputMethods.getValidInt(input, "Enter a number between 7 and 10:", 7, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 4) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        { // Test 5 - check that the method will ignore a string and can return the
          // maximum value from the second line.
            Scanner input = new Scanner("word\n10");
            int expected = 10;
            int actual = InputMethods.getValidInt(input, "Enter a number between 1 and 10:", 1, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 5) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        { // Test 6 - check if the method will ignore two strings and can identify a valid
          // integer within bounds on the third input
            Scanner input = new Scanner("word\nword\n5");
            int expected = 5;
            int actual = InputMethods.getValidInt(input, "Enter a number between 1 and 10:", 1, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 6) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        { // Test 7 - check if the method will return a -3 if it has found three invalid
          // inputs on new lines.
            Scanner input = new Scanner("0\n1\n11");
            int expected = -3;
            int actual = InputMethods.getValidInt(input, "Enter a number between 1 and 10:", 1, 10);

            if (actual != expected) {
                error = true;
                System.out.println("testGetValidInt 7) Error, expected: " + expected + ", actual: " + actual);
            }
        }

        if (error) {
            System.out.println("testGetValidInt failed");
        } else {
            System.out.println("testGetValidInt passed; it is expected that the prompt and "
                    + "getValidInt error messages are printed out.");
        }
    }
}
