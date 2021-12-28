package zyLabsChapter6;

import java.util.Scanner;

public class DrawRightTriangle {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String userCharacter = scnr.next();

        while (true) {
            
            System.out.println("Enter triangle height (1-10): ");
            int triangleHeight = scnr.nextInt();

            if (triangleHeight > 10 || triangleHeight < 1) {
                System.out.println("Please enter height between 1 and 10.");
                continue;
            } 

            for (int k = triangleHeight; k >= 1; k--) {
                for (int y = 0; y < k; y++) {
                    System.out.print(userCharacter + " ");
                }
                    System.out.println();
            }
            scnr.close();
            break;
        }
    }
}