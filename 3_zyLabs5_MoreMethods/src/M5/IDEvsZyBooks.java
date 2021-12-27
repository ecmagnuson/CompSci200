package M5;

import java.util.Scanner;

public class IDEvsZyBooks {

    //private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integers:");
        int a = readInt(input);
        int b = readInt(input);
        int c = readInt(input);
        System.out.println("The integers you entered are: " + a + ", " + b + ", and " + c);
        compareSum(a, b, c);

        System.out.println("Enter 3 words:");
        input.nextLine();
        String d = readWord(input);
        String e = readWord(input);
        String f = readWord(input);
        System.out.println(
                "The words you entered are: \"" + d + "\", \"" + e + "\", and \"" + f + "\"");
        compareSum(d, e, f);

        input.close();
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

        if ((d + e).equals(f)) {
            System.out.print("\"" + d + "\"" + " concatenated with " + "\"" + e + "\"" + " is "
                    + "\"" + f + "\"");
        } else {
            System.out.print("\"" + d + "\"" + " concatenated with " + "\"" + e + "\"" + " is not "
                    + "\"" + f + "\"");
        }
    }

    public static int readInt(Scanner intInput) {
        return intInput.nextInt();
    }

    public static String readWord(Scanner strInput) {
        return strInput.next();
    }
}