package M5;

import java.util.Scanner;

public class HelloIDE {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String name = scnr.next();
        name = name.replaceAll("\\s+", "");
        

        if (!scnr.hasNextLine() && name.isEmpty()) {
            System.out.print("Hello, Stranger!");
        }

        else {
            System.out.println("Hello, " + name + "!");
        }
        
        scnr.close();
    }
}
