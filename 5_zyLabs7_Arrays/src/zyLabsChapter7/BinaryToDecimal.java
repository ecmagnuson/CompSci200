package zyLabsChapter7;

import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        int bitLength;
        int decimalSum;
        int j;
        int k;

        bitLength = scnr.nextInt();

        int[] binaryNum = new int[bitLength];

        // get rid of line from bitLength
        scnr.nextLine();
        String userInput = scnr.nextLine();

        j = 0;

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' ') {
                continue;
            }
            // subtract from 48 because ASCII char 0 is 48
            binaryNum[j] = userInput.charAt(i) - 48;
            j++;
        }

        // if char not a space add to array
        // else skip
        for (int i = 0; i < binaryNum.length / 2; i++) {
            int temp = binaryNum[i];
            binaryNum[i] = binaryNum[binaryNum.length - 1 - i];
            binaryNum[binaryNum.length - 1 - i] = temp;
        }

        k = 0;
        decimalSum = 0;

        for (int i = 0; i < binaryNum.length; i++) {
            // if i == 0 doesn't matter. 0 * num == 0
            if (binaryNum[i] == 1) {
                decimalSum = decimalSum + (binaryNum[i] * (int) Math.pow(2, k));
            }
            k++;
        }
        System.out.println(decimalSum);
    }
}