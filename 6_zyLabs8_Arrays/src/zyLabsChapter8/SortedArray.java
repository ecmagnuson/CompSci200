package zyLabsChapter8;

public class SortedArray {

    public static boolean isOrdered(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Test out-of-order example.
        int[] nums1 = { 5, 6, 7, 8, 3 };

        if (isOrdered(nums1)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }

        // Test in-order example.
        int[] nums2 = { 5, 6, 7, 8, 10 };

        if (isOrdered(nums2)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }
    }
}
