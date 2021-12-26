package zyLabsChapter6;

import java.util.Scanner;



///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           Printing a right triangle.
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

public class DrawRightTriangle {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a character: ");
		String userCharacter = scnr.next();
		
		System.out.println("Enter triangle height (1-10): ");
		
		while (true) {
			
			int triangleHeight = 0;
			
			triangleHeight = scnr.nextInt();
			
			if (triangleHeight > 10 || triangleHeight < 1) {
				System.out.println("Please enter height between 1 and 10.");
				continue;
			}	else if (triangleHeight <= 10 || triangleHeight >= 1) {
					System.out.println("");
					for (int k = triangleHeight; k >= 1; k--) {
						for (int y = 0; y<k; y++ ) {
							System.out.print(userCharacter + " ");
					}
							System.out.println();
					} break;
			}
			}
			
		}
		

	}

