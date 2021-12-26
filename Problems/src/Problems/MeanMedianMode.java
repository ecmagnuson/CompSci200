package Problems;
import java.util.Arrays;

public class MeanMedianMode {

    public static double mean(int[] nums) {

        // sum the numbers in array.
        // Look into if java has a sum() method.
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return (double) sum / nums.length;
    }

    public static double median(int[] nums) {

        int middle;
        // With Python this would need to be // instead of /.
        // Java defaults to floor division automatically.
        middle = nums.length / 2;

        // if list is odd in length
        if (nums.length % 2 == 1) {
            return nums[middle];
        }

        return (double) (nums[middle] + nums[middle - 1]) / 2;
    }

    public static void main(String[] args) {
        // when new is used memory space is allocated in heap
        // variable nums0 is a reference to the array
        // create a new array of 10 int elements on the heap initialized to 0 values
        //but the variable nums0 is on the stack
        int[] nums0 = new int[10];
        /*
         * create a new array of 3 int elements on the heap initialized to 2, 3, and 4,
         * respectively.
         */
        int[] nums = new int[] {2, 3, 4};
        Arrays.sort(nums);

        System.out.println(mean(nums));
        System.out.println(median(nums));
    }

}
