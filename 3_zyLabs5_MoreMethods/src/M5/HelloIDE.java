package M5;
///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:          Greeting for username input. Responding with stranger if input is empty.
// Course:         CS200 F21
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// I want all white space, or if no input, to print the stranger. I looked up on SO how to do this
// and I found the ".isEmpty()" function (which I use in the if statement), which works really nicely for this.
// I don't remember if we've learned this yet, but it works way better than doing a million if statements, etc. 
// String.equals("") can only test for input of nothing but not any more whitespace. 
// I found it used one of the answers here https://stackoverflow.com/questions/37800423/detecting-empty-input-java
// and I just took it and inserted into my own code for use. 
//
//
// I wasn't sure how to replace the white space before a string so I looked that up as well.
// .replaceAll("\\s+","") turned out to work from a SO question I found.
//  I found out that \\s removes anything that is a space character. so I wasn able to use it to remove the whitespace from a name.
//	
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

public class HelloIDE {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		
		
		String name = scnr.nextLine();
		name = name.replaceAll("\\s+","");

				
	
		if (!scnr.hasNextLine() && name.isEmpty()) {
			System.out.print("Hello, " + Config.SEED + "!");
		}
		
		else {
			System.out.println("Hello, "+name+ "!");
		}
		
		

	}

}

