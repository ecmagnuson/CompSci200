package zyLabsChapter8;

import java.util.Scanner;

public class TwoDimensionalArrayMinMax {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int[][] milesTracker = new int[2][2];

        int maxMiles;
        int minMiles;

        for (int i = 0; i < milesTracker.length; i++) {
            for (int j = 0; j < milesTracker[i].length; j++) {
                milesTracker[i][j] = scnr.nextInt();
            }
        }
        scnr.close();

        // initializing these variables
        // making the maxMiles the smallest value
        // making the minMiles the biggest value
        maxMiles = Integer.MIN_VALUE;
        minMiles = Integer.MAX_VALUE;

        for (int i = 0; i < milesTracker.length; i++) {
            
            for (int j = 0; j < milesTracker[i].length; j++) {
                
                if (milesTracker[i][j] < minMiles) {
                    minMiles = milesTracker[i][j];
                }
                if (milesTracker[i][j] > maxMiles) {
                    maxMiles = milesTracker[i][j];
                }
            }
        }
        // werks
        System.out.println("Min miles: " + minMiles);
        System.out.println("Max miles: " + maxMiles);
    }
}