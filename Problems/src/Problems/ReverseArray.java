package Problems;

public class ReverseArray {

    public static void main(String[] args) {
        
        int[] num = {1,2,3,4,5};
        
        for (int i = 0; i < num.length/2; i++) {
            int tempVal = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = tempVal;
        }
    }
}
