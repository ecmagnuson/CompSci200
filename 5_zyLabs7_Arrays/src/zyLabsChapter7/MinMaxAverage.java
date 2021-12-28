package zyLabsChapter7;

//Find the min and max of a int array
//remove these 2 from the array and average the other numbers
public class MinMaxAverage {
    
    public static int min(int[] array) {
        
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int max(int[] array) {
        
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    public static double average(int[] array) {
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        
        int[] list = {5,5,1,5,5,10};
        int min = min(list);
        int max = max(list);
        
        int[] remaining = new int[list.length - 2];
        
        for (int i = 0, x = 0; i < list.length; i++) {
            if (list[i] != min && list[i] != max) {
                //I don't understand why this with x++ works..
                //If I just put i there it will skip filling the array at the index of min or max
                remaining[x++] = list[i];
            }
        }
        System.out.println("Average of remaining is " + average(remaining));
    }
}
