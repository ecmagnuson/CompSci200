package zyLabsChapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    
    public static void main(String[] args) {
        //All of this is  not needed. 
       // ArrayList<String> item = new ArrayList<>(Arrays.asList("oreo", "ice-cream", "oatmeal"));
        
        //You can do this as if you're avoiding int division 
        // i.e. (1/2) is 0 bc java does int division
        // (double) (1/2) is 0.5 though because you're casting to a double.
        //This is the same principle.
        //ArrayList<String> item2 = (ArrayList<String>) Arrays.asList("oreo", "ice-cream", "oatmeal");
        
        List<String> item3 = Arrays.asList("oreo", "ice-cream", "oatmeal");
        
        item3.add("pinneapple");
        
        System.out.println(Arrays.toString(item3.toArray()));
        
        
    }

}
