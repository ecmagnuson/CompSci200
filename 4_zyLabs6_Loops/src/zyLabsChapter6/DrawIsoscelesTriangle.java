package zyLabsChapter6;

import java.util.Scanner;

public class DrawIsoscelesTriangle {
    
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int triangleHeight = 0;

        int i = 0;
        int j = 0;

        while (true) {
            System.out.print("Enter triangle height: ");
            triangleHeight = scnr.nextInt();
            if (triangleHeight > 0 && triangleHeight % 2 == 1) {
                break;
            }
            System.out.println("Enter an odd number");
            continue;
        }

        System.out.println();
        System.out.println();

        for (i = 1; i <= triangleHeight; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int k = triangleHeight - 1; k >= 1; k--) {
            for (int y = 0; y < k; y++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }

        return;

    }
}
