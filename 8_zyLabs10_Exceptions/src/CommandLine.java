
public class CommandLine {
    public static void main(String[] args) {
        
        int userNumber;
        
        try {
            
            if (args.length == 0) {
                throw new Exception("Pass 1 argument");
            }
            
            //if not userNumber is type(int):
            //Exception
            
            
           // userNumber = Integer.valueOf(args[0]);
            try {
                userNumber = Integer.parseInt(args[0]);    
            }
            catch (NumberFormatException e) {
                System.out.print("Cant convert to integer");
                throw e;
            }
            
            if (args.length > 1) {
                throw new Exception("Pass 1 argument");
            }
            
            if (userNumber < 0) {
                throw new Exception("Argument is a negative number");
            }
            
            //Integer.parseInt(userInput);
            
            int factorial = 1;
            for (int i = 0; i < userNumber; ++i) {
                factorial = factorial * (userNumber - i);
            }
            
            System.out.print("The factorial of " + userNumber + " is " + factorial);
        }
        catch (Exception excpt) {
            System.out.print(excpt.getMessage());
        } 
    }
}