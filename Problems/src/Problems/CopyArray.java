package Problems;

public class CopyArray {

    public static void main(String[] args) {
        
        int[] nums = {5,6,7,8,9};
        int[] copyNums = new int[nums.length];
        
        int i = 0;
        for(int number: nums) {
            copyNums[i] = number;
            i++;
        }
        
        for (int j = 0; j < copyNums.length; j++) {
            System.out.print(copyNums[j]);
        }
    }
}
