package zyLabsChapter8;

import java.util.Arrays;

public class ModifyArray {
    /*
     * Write a method swapArrayEnds() that swaps the first and last elements of its
     * array parameter. Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}.
     */
    public static void swapArrayEnds(int[] sortArray) {

        int[] tempArray = new int[4];

        for (int i = 0; i < sortArray.length; ++i) {
            tempArray[i] = sortArray[i];
        }

        sortArray[0] = sortArray[sortArray.length - 1];
        sortArray[sortArray.length - 1] = tempArray[0];
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 30, 40};
        
        swapArrayEnds(list);

        //much easier way to print array
        System.out.println(Arrays.toString(list));
    }
}