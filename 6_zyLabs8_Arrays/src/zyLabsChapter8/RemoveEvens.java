package zyLabsChapter8;

import java.util.Arrays;

public class RemoveEvens {

    public static int[] removeEvens(int[] nums) {

        // I have to create a new array that only has odd numbers in it.
        // count the amount of even numbers in nums
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                j++;
            }
        }

        // making a list the size we would expect.
        // j is all of the numbers we removed that are even
        int newNums[] = new int[nums.length - j];

        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0) {
                newNums[k] = nums[i];
                k++;
            }
        }
        return newNums;
    }

    public static void main(String[] args) {

        int[] input = {-5,-4,-3,-2,-1,0,1,2,3,4,5};

        System.out.println(Arrays.toString(removeEvens(input)));
    }
}
