///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Working with char arrays: swapping indices, reversing, counting chars
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

/**
 * This class is a program that creates a char array and manipulates it by
 * swapping indices, reversing the array, and printing out the amount of each
 * alphabet chars present in the array.
 * 
 * @author Jim Williams
 * @author Elliott Magnuson
 */
public class MysteryMethods {

    /**
     * This main method creates a char array and manipulates it by calling five
     * methods. It prints out the array, calls a method to return the index of char
     * 'e' and 'g' and then another method to swap their places. It then calls a
     * method that reverses the char array. Finally, it calls two more methods that
     * count the amount of each alphabet chars present in the array, and then prints
     * it out with a description.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {

        System.out.println("Welcome to Mystery Methods!");
        char[] charArray = { 'e', 'n', 'i', 'r', 't', 'S', 'g', 'l', 'p', 'm', 'i', 'S' };
        System.out.print("Initial array: ");
        System.out.println(charArray);
        System.out.println(" \nMethod Outputs:");

        int eIndex = getCharIndex('e', charArray);
        System.out.println("First call of the first Method:");
        System.out.println(eIndex);

        int gIndex = getCharIndex('g', charArray);
        System.out.println("Second call of the first Method:");
        System.out.println(gIndex);

        swapCharIndex(eIndex, gIndex, charArray);
        System.out.println("Call of the second Method:");
        System.out.println(charArray);

        charArray = reverseCharArray(charArray);
        System.out.println("Call of the third Method:");
        System.out.println(charArray);

        char[] alphabetChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        int[] charCounts = getCharCounts(alphabetChars, charArray);

        System.out.println("Call of the fourth Method:");
        printInput("Fourth Method Output:", charCounts);
    }

    /**
     * This method prints the description followed by the contents of list. The list
     * begins with '[', ends with ']' and each element is separated with ', '.
     * Example: printInput( "Initial array:", new int[]{1,2,3}) Initial array: [1,
     * 2, 3]
     * <p>
     * 
     * @param description The text printed out before the list of ints.
     * @param list        The array of ints to be printed.
     */
    public static void printInput(String description, int[] list) {

        System.out.print(description);
        System.out.print(" [");

        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list[i]);
        }
        System.out.println("]");
    }

    /**
     * This method returns the index of a specified char in an array of chars.
     * 
     * @param searchChar The char to determine the index of.
     * @param charArray  The array of chars to search through.
     * 
     * @return The index of searchChar in the array. returns -1 if the char is not
     *         in the array.
     */
    public static int getCharIndex(char searchChar, char[] charArray) {

        for (int i = 0; i < charArray.length; i++) {
            if (searchChar == charArray[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method swaps two chars at their specified index in a given array. If the
     * index of one of the chars is less than 0 or greater than the array length, it
     * will exit the method without swapping the chars.
     * 
     * @param firstIndex  The index of the first char
     * @param secondIndex The index of the second char
     * @param charArray   The updated char array with indices swapped.
     */
    public static void swapCharIndex(int firstIndex, int secondIndex, char[] charArray) {

        if (firstIndex < 0 || secondIndex < 0 || charArray.length <= Math.max(firstIndex, secondIndex)) {
            return;
        }

        char temp = charArray[firstIndex];
        charArray[firstIndex] = charArray[secondIndex];
        charArray[secondIndex] = temp;
    }

    /**
     * This method reverses a char array passed to it.
     * 
     * @param charArray the array that will be reversed.
     * @return The reversed array.
     */
    public static char[] reverseCharArray(char[] charArray) {

        if (charArray.length == 0) {
            return charArray;
        }

        char[] reversedArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            reversedArray[charArray.length - i - 1] = charArray[i];
        }
        return reversedArray;
    }

    /**
     * This method loops through and compares two arrays. A reference array is
     * compared to a char array, and it counts how many times a specific char is
     * present in the array. It returns an int array with the counts in the order of
     * the reference array. Example: if reference array = {'a','b'}, and char array
     * = {'A','a','a'}, the returned int array is {'3','0'}. Note that lower and
     * upper case chars are counted together in this method.
     * 
     * @param referenceArray The array containing the chars we want to count.
     * @param charArray      The array we want to search through, and then count the
     *                       amount of each specific char.
     * @return An int array with the count of each char in charArray in the order of
     *         the reference array .
     */
    public static int[] getCharCounts(char[] referenceArray, char[] charArray) {

        if (referenceArray.length == 0 || charArray.length == 0) {
            return new int[referenceArray.length];
        }

        int[] charCounts = new int[referenceArray.length];

        for (int i = 0; i < referenceArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (Character.toUpperCase(charArray[j]) == Character.toUpperCase(referenceArray[i])) {
                    charCounts[i] += 1;
                }
            }
        }
        return charCounts;
    }
}