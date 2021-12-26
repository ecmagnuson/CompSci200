package Problems;

/*
 * Write a loop that sets newScores to oldScores shifted once left, with element 0 copied to the end. 
 * Ex: If oldScores = {10, 20, 30, 40}, then newScores = {20, 30, 40, 10}. 
 */

public class ShiftingArray {
    
    public static void main(String[] args) {
        
        int[] oldScores = {10, 20, 30, 40};
        int[] newScores = new int[oldScores.length];
        
        //Shifting each value to the left
        //manually shifting the last value
        for (int i = 0; i < newScores.length - 1; i++) {
            newScores[i] = oldScores[i + 1];
        } newScores[newScores.length - 1] = oldScores[0];
        
        for (int i = 0; i < newScores.length; ++i) {
            System.out.print(newScores[i] + " ");
        }
        
        System.out.println();
    }
}
