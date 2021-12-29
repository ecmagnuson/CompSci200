package zyLabsChapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class FindingStringsInArrayList {

    public static void main(String[] args) {

        //I have an array list, called item.
        ArrayList<String> items = new ArrayList<>(Arrays.asList("oreo", "ice-cream", "oatmeal"));
        
        //lets say I want to find "oatmeal".
        //iterate through the list and find when if it is oatmeal. 
        for (int i = 0; i < items.size(); i++) {
            //this using .equals works
            if (items.get(i).equals("oatmeal")) {
                items.remove(i);
            }
        }
        
        //Java also has a for each loop
        for (String food : items) {
            if (food.equals("oreo")) {
                items.remove("oreo");
            }
        }
        System.out.println(items);
    }
}
