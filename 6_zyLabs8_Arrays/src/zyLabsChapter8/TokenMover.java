package zyLabsChapter8;

public class TokenMover {
    
    /**
     * This method returns the index of the first instance of the delimiter, or -1
     * if it is not found.
     * 
     * Example: delimiter ',' and input "one,two,three".toCharArray() should return
     * 3.
     * 
     * @param delimiter a character to split the string with
     * @param input     a character array
     * @return int the index of the first occurence of the delimiter
     */
    public static int firstDelimiterIndex(char delimiter, char[] input) {
        return new String(input).indexOf(delimiter);
    }

    /**
     * Reorder char[] input by moving the first token to the end of the array. This
     * method should return the array after modifying it. Hint: use
     * firstDelimiterIndex() to find the index of the array you need to be
     * considering.
     * 
     * Example: delimiter ',' and input "one,two,three".toCharArray() should return
     * "two,three,one"
     * 
     * @param delimiter    a character to split the string with
     * @param oldCharArray a character array
     * @return char[] input the modified character array
     */
    public static char[] moveFirstToken(char delimiter, char[] oldCharArray) {

        int delimiterIndex1 = firstDelimiterIndex(delimiter, oldCharArray);

        char[] newCharArray = new char[oldCharArray.length];

        int i = 0;
        for (i = 0; i < oldCharArray.length - delimiterIndex1 - 1; i++) {
            newCharArray[i] = oldCharArray[delimiterIndex1 + i + 1];
        }

        try {
            newCharArray[i] = delimiter;
        } catch (ArrayIndexOutOfBoundsException e) {
            return oldCharArray;
        }

        i++;
        int j = i;
        while (i < oldCharArray.length) {
            newCharArray[i] = oldCharArray[i - j];
            i++;
        }
        return newCharArray;
    }

    public static void main(String[] args) {

        String s1 = "a,comma,separated,list";
        String s2 = "Hello";

        char[] oldCharArray = s1.toCharArray();
        char[] oldCharArray2 = s2.toCharArray();

        System.out.println("Expected: comma,separated,list,a");
        System.out.print("Actual: ");
        System.out.println(moveFirstToken(',', oldCharArray));
        System.out.println(moveFirstToken(';', oldCharArray2));
    }
}
