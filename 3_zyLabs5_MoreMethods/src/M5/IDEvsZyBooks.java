package M5;

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:          Using scanner correctly and passing into a method
//Course:         CS200 F21
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//Because scanner created in the main method is only local to the main method I made it a global variable.
//https://stackoverflow.com/questions/15961823/utilizing-a-scanner-inside-a-method
//This SO talks about it. I believe that having private before instead of public means that other files cant access this scanner
//which makes no difference in this case, but would matter if you have a bunch of files with different scanners. 
//This way I can pass scanner into methods without creating more than one istance of it. 
//Creating a method just to pass scanner into it seems kind of weird
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

public class IDEvsZyBooks {
	
	private static Scanner sc = new Scanner(System.in);
   
	public static void main(String[] args) {
		
		
        System.out.println("Enter 3 integers:");
        int a = readInt();
        int b = readInt();
        int c = readInt();
        System.out.println("The integers you entered are: " + a + ", " + b + ", and " + c);
        compareSum(a, b, c);
        
        System.out.println("Enter 3 words:");
        sc.nextLine();
        String d = readWord();
        String e = readWord();
        String f = readWord();
        System.out.println("The words you entered are: \"" + d + "\", \"" + e + "\", and \"" + f + "\"");
        
        compareSum(d, e, f);
        
        sc.close();
    }

    public static void compareSum(int a, int b, int c) {
        if (a + b == c) {
            System.out.println(a + " + " + b + " equals " + c);
        } else if (a + b < c) {
            System.out.println(a + " + " + b + " is less than " + c);
        } else {
            System.out.println(a + " + " + b + " is greater than " + c);
        }
    }
    
    public static void compareSum(String d, String e, String f) {
    	
    	if ((d+e).equals(f)) {
    		System.out.print("\"" + d + "\"" + " concatenated with " + "\"" + e + "\"" + " is " + "\"" + f + "\"");
    	}
    	else {
    		System.out.print("\"" + d + "\"" + " concatenated with " + "\"" + e + "\"" + " is not " + "\"" + f + "\"");
    	}
  
    	
    }

    public static int readInt() {
    	return sc.nextInt();
    }

    public static String readWord() {
        return sc.next();
        
    }
}