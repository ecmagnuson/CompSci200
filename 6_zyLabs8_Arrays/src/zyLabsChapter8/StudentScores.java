package zyLabsChapter8;

import java.util.Arrays;

public class StudentScores {

    public static void main(String[] args) {

        int[] bonusScores = {10, 20, 30, 40};
        /*
         * Write a loop that sets each array element to the sum of itself and the next
         * element, except for the last element which stays the same. 
         * 
         * Initial scores: 10, 20, 30, 40 Scores after the loop: 30, 50, 70, 40
         */
        for (int i = 0; i < bonusScores.length - 1; ++i) {
            bonusScores[i] += bonusScores[i + 1];
        }
        System.out.println(Arrays.toString(bonusScores));
    }
}
