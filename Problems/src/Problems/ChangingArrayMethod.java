package Problems;

import java.util.Arrays;

public class ChangingArrayMethod {
    
    static int[] change( int num, int [] list) {
        list = new int[]{4,5,6};
        list[2] = num;
        
        return list;
    }

    public static void main( String [] args) {
        int [] list = new int[] {1,2,3};
        int num = 10;
        list = change( num, list);
        System.out.println("num:" + num + "\nlist:" + Arrays.toString( list));
    }

}
