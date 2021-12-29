package zyLabsChapter8;

import java.util.Arrays;

public class ModifyingArrays {
    /*
     * Write a loop that subtracts 1 from each element in lowerScores. If the
     * element was already 0 or negative, assign 0 to the element. Ex: lowerScores =
     * {5, 0, 2, -3} becomes {4, 0, 1, 0}
     */
    public static void main(String[] args) {
        
        int[] list = {5, 0, 2, -3};

        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] - 1;
            if (list[i] < 0) {
                list[i] = 0;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}