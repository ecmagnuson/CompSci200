package zyLabsChapter10Exceptions;

public class Exception2 {

    public static void main(String[] args) {
        
        try {
            int x = 5/0;
            System.out.print(x);
            
            
        } 
        catch (Exception e) {
            System.out.print("bad");
        }

    }

}
