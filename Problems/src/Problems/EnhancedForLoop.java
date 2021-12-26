package Problems;

public class EnhancedForLoop {

    public static void main(String[] args) {

        char[] letters = { 'a', 'b', 'c', 'd' };

        // the for each loop will print out without needing index
        for (char letter : letters) {
            System.out.print(letter);
        }
        System.out.println();

        // But what if I need index?
        int i = 0;
        for (char letter : letters) {
            System.out.print(i);
            System.out.print(letter + " ");
            i++;
        }
        System.out.println();

        // I want to change one of the values using a for each loop
        for (char letter : letters) {
            // a char can't be compared with .equals, but the reference Character can
            if (letter == 'c') {
                letter = 'f';
            }
            System.out.print(letter);
        }
    }
}
