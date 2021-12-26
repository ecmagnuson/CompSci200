package Problems;

public class ArrayBackwards {

    public static void main(String[] args) {

        // initializing array and creating a reference on the heap.
        // the array is located on the heap
        // the variable nums is on thestack and references to the array.
        int[] nums = { 10, 11, 12, 13 };

        // print forwards
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // print backwards
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
