
public class MeanMedianMode {
    
    //returns the sum of a double array
    public static double sum(double[] array) {
        double sum = 0;
        for (double number: array) {
            sum += number;
        }
        return sum;
    }
    
    //returns the mean of a double array
    public static double mean(double[] array) {
        return (sum(array))/array.length;
    }
    
    //returns the median of a double array w/o changing original array.
    public static double median(double[] array) {
        
        double[] temp = new double[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
        
        if (temp.length % 2 == 1) {
             return temp[temp.length / 2];
        }
        
        double[] twoMedianNums = new double[2];
        twoMedianNums[0] = array[(array.length/2) - 1];
        twoMedianNums[1] = array[array.length/2];

        return sum(twoMedianNums)/twoMedianNums.length;
    }
    
    //TODO mode with hashmaps
    
    public static void main(String[] args) {
        
        double[] list = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Mean is: " + mean(list));
        System.out.println("Median is: " + median(list));
    }
}
