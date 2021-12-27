package Problems;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        //get(key) returns the value 
        System.out.println(hm.get(0));
        
        //put method
        //at key 0 set the value to 100
        hm.put(0, 100);
        System.out.println(hm.get(0));
         
        System.out.println(hm.size());
    }
}
