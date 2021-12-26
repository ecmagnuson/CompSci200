
public class factorial {

    public static void main(String[] args) {
        
        int userNumber = 4;
        int factorial = 1;
        /*
         * for (int i = 0; i < userNumber; ++i) {
            factorial = factorial * (userNumber - i);
        }
         */
        
        for (int i = 1; i <= userNumber; i++) {
            factorial = factorial * i;
        }
        
        System.out.print(factorial);

    }

}
