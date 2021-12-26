package Problems;

public class SwapArrayMethod {
    
    public static void swap(int[]array) {
        
        array[0] = array[4];
        
        
    }
    
    public static void main(String[] args) {
     
        int[] nums = {1,2,3,4,5};
        
        swap(nums);
        
        //references to arrays are passed so it actually changes the array.
        
    }
}
