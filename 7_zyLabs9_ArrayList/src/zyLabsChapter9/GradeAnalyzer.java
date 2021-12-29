package zyLabsChapter9;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeAnalyzer {

    /**
     * This method first generates a random number between 0 and 100 (both
     * inclusive), and then append this generated number at the end of the ArrayList
     * grades.
     * 
     * @param grades the ArrayList of all students' grades
     * @param rand   a random generator to generate grades
     */
    public static void addGrade(ArrayList<Integer> grades, Random rand) {

        if (grades == null || rand == null) {
            return;
        }
        // the loop is in main.
        int randomNumber = rand.nextInt(101);
        grades.add(randomNumber);
    }

    /**
     * This method searches for the lowest score in the ArrayList.
     * 
     * @param grades the ArrayList of scores to be searched from
     * @return the minimum element in the ArrayList; -1 if it is null; or 0 if the
     *         ArrayList is empty.
     */
    public static int getMin(ArrayList<Integer> grades) {

        int minScore = 100;

        if (grades == null) {
            return -1;
        }

        else if (grades.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < minScore) {
                minScore = grades.get(i);
            }
        }
        return minScore;
    }

    /**
     * This method calculates an average over all the scores in the ArrayList
     * 
     * @param grades the ArrayList of all scores
     * @return the average over all the elements in the ArrayList; -1 if the
     *         ArrayList is null or empty;
     */
    public static double calcAvg(ArrayList<Integer> grades) {

        if (grades == null || grades.isEmpty()) {
            return -1;
        }
        // calculate the average score of the values in grades.
        // sum then divide by length.
        // Python has really nice included functions for this stuff, im sure i could
        // find one somewhere, but to practice java ill do it the hard way.
        
        double sumGrades = 0;
        double averageGrades;
        
        for (int i = 0; i < grades.size(); i++) {
            sumGrades += grades.get(i);
        }
        
        averageGrades = sumGrades/grades.size();
        return averageGrades;
    }

    /**
     * This method calculates the percentage of students whose grades are lesser
     * than or equal to a certain threshold. E.g.: if grades = [1, 2, 3, 4, 5] and
     * threshold = 4 the return value should be 80.0 (because 1, 2, 3, 4, are below
     * threshold; 4 / 5 = 80%)
     * 
     * Note: The return value should include decimals. Make sure to use double
     * division instead of integer division.
     * 
     * @param grades    the ArrayList of all students' grades
     * @param threshold a specific number to compare with
     * @return a percentage in the range of [0.0, 100.0]; or -1 if the ArrayList is
     *         null or empty.
     */
    public static double calcPercentageBelow(ArrayList<Integer> grades, int threshold) {
        
        if (grades == null || grades.isEmpty()) {
            return -1;
        }
        
        int count = 0;
    
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) <= threshold) {
                count += 1;
            }
        }
        
        double belowThreshold;
        belowThreshold = (double)(count) / grades.size();
        
        return belowThreshold * 100;
    }

    /**
     * This method finds out all the students in the ArrayList with a certain grade,
     * and stores their indices from that list into a new ArrayList, which is then
     * returned.
     * 
     * @param grades      the ArrayList of all students' grades
     * @param gradeToFind a specific grade to be found in the ArrayList
     * @return an ArrayList of found indices in ascending order; or null if grades
     *         is null
     */
    public static ArrayList<Integer> findStudentsWithGrade(ArrayList<Integer> grades, int gradeToFind) {
        
        if (grades == null || grades.isEmpty()) {
            return null;
        }
        //populate this array list with indices of people that got 100% on the grades array list.
        ArrayList<Integer> fullMarks = new ArrayList<Integer>();
        
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) == gradeToFind) {
                fullMarks.add(i);
            }
        }  
        return fullMarks;
    }
    

    public static void main(String[] args) {
        
        ArrayList<Integer> grades = new ArrayList<Integer>();
        Random rand = new Random(1);
        
        for (int i = 0; i < 500; i++) {
            addGrade(grades, rand);
        }

        int minScore = getMin(grades);
        System.out.println("The lowest score in this class is: " + minScore);

        double aveScore = calcAvg(grades);
        System.out.println("The average score in this class is: " + aveScore);

        int target = 50;
        double failingRate = calcPercentageBelow(grades, target);
        System.out.println("The percentage of students below " + target  + " is: " + failingRate + "%");

        ArrayList<Integer> studentIndices = findStudentsWithGrade(grades, 100);
        System.out.println("Here are the IDs of students who got full marks: " + studentIndices);
    }
}
