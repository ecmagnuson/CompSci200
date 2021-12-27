package zyLabsChapter4;

import java.util.Scanner;

public class Caption {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String userCaption = input.nextLine();
        input.close();

        if (userCaption.equals("..")) {
            userCaption = userCaption.replace(".", "");
            userCaption = userCaption + ".";
        } else if (userCaption.equals(".")) {

        } else if (userCaption.substring(userCaption.length() - 1).equals("!")
                || userCaption.substring(userCaption.length() - 1).equals("?")) {

        } else if (userCaption.substring(userCaption.length() - 1).equals(",")) {
            userCaption = userCaption.replace(",", ".");
        } else if (userCaption.substring(userCaption.length() - 3).equals("...")) {

        } else if (userCaption.substring(userCaption.length() - 2).equals("..")) {
            userCaption = userCaption.replace(".", "");
            userCaption = userCaption + ".";
        } else if (!userCaption.substring(userCaption.length() - 1).equals(".")) {
            userCaption = userCaption + ".";
        }

        System.out.println(userCaption);
    }
}
