import java.util.*;
import java.io.*;


public class FunnyClass {

    public static void main(String[] args) {
        writeList();
        
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("What file to you want to open?");
            String input = s.nextLine();
            if (input.length() < 1) {
                break;
            }
            
            File f = new File(input);
            readList(f);
        }
        
        System.out.println("Goodbye");
        
        s.close();
    }
    
    static void writeList() {
        
        File pedo = new File("pedo.txt");
        
        PrintWriter p;
        try {
            p = new PrintWriter(pedo);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Occurred!");
            return;
        }
        
        int[] amounts = {2,4,8,30,6,10,3,2,1};
        String[] items = {"onions","green peppers","diet coke", "eggs", "garlic", "yogurt","lemons","milk", "cheese"};
        
        for (int i = 0; i < amounts.length; i++) {
            p.printf("%d %s\n", amounts[i], items[i]);
        }
        
        p.close();
    }

    static void readList(File f) {
        
        Scanner s;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("FileNotFoundException occurred!!");
            return;
        }
        
        // print contents
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        
        s.close();
        
    }
    
}
