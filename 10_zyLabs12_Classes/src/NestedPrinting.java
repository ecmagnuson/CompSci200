///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           Nested
//Course:          CS200 F21
//
//Author:          Elliott Magnuson
//Email:           ecmagnuson@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//https://docs.oracle.com/javase/7/docs/api/java/io/File.html#exists()
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

/**
 * A class that can be used to build String representations of 1D, 2D, and 3D String arrays
 * to display their contents.
 */
public class NestedPrinting {

    /**
     * Takes a one-line String of input and makes a new version of
     * it which ends with a suffix and is of the given length.
     * To make it the correct length, the original input
     * should either be truncated (losing some characters)
     * or it should be padded at the end with spaces (' ')
     * before adding the suffix.
     * Example output:
     * endWith("abc","txt",5)
     * returns: "abtxt"
     * endWith("ab","txt",6)
     * returns: "ab txt"
     * 
     * @param input A single line String to be fixed
     * @param suffix The String that the output should end with
     * @param length The total length of the output, including the suffix
     * @return A String of the given length which ends with the suffix
     **/
    public static String endWith(String input, String suffix, int length) {
        
        String output = "";
        
        if (suffix.length() + input.length() >= length) {
            int inputLength = length - suffix.length();
            output = input.substring(0, inputLength) + suffix;
            return output;
        }
        
        String amtSpaces = lineOf(' ', length - (input.length() + suffix.length()));
        return input + amtSpaces + suffix;
    }

    /**
     * Returns a line of characters which consists of
     * lineChar repeated length times.
     * @param lineChar The character to create a line out of
     * @param length The length of the returned String
     * @return A String of the given length consisting only of lineChar
     */
    public static String lineOf(char lineChar, int length) {
        
        char[] lineCharArray = new char[length];
        
        for (int i = 0; i < lineCharArray.length; ++i) {
            lineCharArray[i] = lineChar;
        }
        
        String lineCharString = new String(lineCharArray);
        
        return lineCharString;
    }

    /**
     * Returns a single String as a representation of an array of Strings.
     * The return should start with '{' and end with '}'. The elements
     * of the array should be included without quotes and with commas
     * after all but the last element of the array.
     * There should be no newline at the end of the returned String.
     *
     * Example output:
     * arrToString(new String[] { "hello", "there", "everyone" })
     * returns: "{hello, there, everyone}"
     *
     * @param arr An array of Strings to be printed
     * @return A String which has the array on a single line
     */
    public static String arrToString(String[] arr) {
        
        String output = "";
        
        if (arr.length == 0) {
            return "{}";
        }
        
        for (int i = 0; i < arr.length; ++i) {
            output = output + arr[i] + ", "; 
        }
        
        return "{" + output.substring(0, output.length() - 2) + "}";
    }


    /**
     * Returns a single String as a representation of an 2D array of Strings.
     * The returned String should have arr.length+2 lines and it
     * should end with a newline.
     * Every line should start with the given prefix and
     * end with the given suffix, but each line will have different contents.
     * 
     * If adding the prefix + suffix would make the line longer
     * than length, then the contents of the line should be truncated
     * to allow for them to be added. You can assume that the
     * length of prefix + suffix is always less than or equal
     * to the length.
     *
     * The first line's contents is just "{".
     * The final line's contents is just "}".
     * The inner line's contents are two spaces ("  ") plus the
     * String representation of a 1D array from arrToString(String[])
     * plus a comma after all but the last element of the 2D array.
     *
     * Example Output (prefix is "_", suffix is "!", length is 15):
     * _{            !
     * _  {Hi, Guy}, !
     * _  {2D}       !
     * _}            !
     *
     * hint: use the arrToString(String[] arr) method you created
     * 
     * @param arr The 2D array we're trying to represent as a String
     * @param prefix A String which should be at the start of
     *      every line of the output
     * @param suffix A String which should be at the end of
     *      every line of the output
     * @param length The length of every line of the output
     */
    public static String arrToString(String[][] arr, String prefix, String suffix, int length) {
        
        String output = "";
        
        // first line
        output = output + endWith(prefix + "{", suffix, length) + "\n";
        
        for (int i = 0; i < arr.length; i++) {
            // _  {Hi, Guy}
            String currentLine = prefix + "  " + arrToString(arr[i]);
            // ,
            if (i != arr.length - 1) {
                currentLine = currentLine + ",";
            }
            // ! [also truncates]
            currentLine = endWith(currentLine, suffix, length);
            // \n
            currentLine = currentLine + "\n";
            
            output = output + currentLine;
        }
        
        // last line
        output = output + endWith(prefix + "}", suffix, length) + "\n";
        
        return output;
    }

    /**
     * Returns a single String as a representation of an 3D array of Strings.
     * EVERY LINE should start with the given prefix and
     * end with the given suffix, but each line will have different contents.
     *
     * The first line's contents is just "{".
     * The final line's contents is just "}".
     * Between them will be a blocks of lines for each 2D array which
     * should be created using arrToString(String[][]). Every line in each block
     * should have two additional spaces ("  ") after the prefix.
     * Between every block, there should be a divider which is a single
     * line which is just the divider character repeated to fit the length.
     *
     * Example Output (prefix is "_", suffix is "!?",
     *      divider is '-", length is 15):
     * _{           !?
     * _  {         !?
     * _    {Hi, Guy!?
     * _    {3D}    !?
     * _  }         !?
     * _------------!?
     * _  {         !?
     * _    {Nope}  !?
     * _  }         !?
     * _}           !?
     *
     * 
     * hint: use the arrToString(String[][] arr, String prefix, String suffix, int length) method you created
     * @param arr The 3D array we're trying to represent as a String
     * @param prefix A String which should be at the start of
     *      every line of the output
     * @param suffix A String which should be at the end of
     *      every line of the output
     * @param divider A character to be repeated to divide blocks
     *      of 2D arrays
     * @param length The length of every line of the output
     * @return A String representing the 3D array
     */
    public static String arrToString(String[][][] arr, String prefix, String suffix, char divider, int length) {
        
        String output = "";
        
        // first line
        output = output + endWith(prefix + "{", suffix, length) + "\n";
        
        for (int i = 0; i < arr.length; i++) {
            String currentBlock = arrToString(arr[i], prefix + "  ", suffix, length);
            
            if (i != arr.length - 1) {
                int dividerLength = length - prefix.length() - suffix.length();
                currentBlock = currentBlock + prefix + lineOf(divider, dividerLength) + suffix + "\n";
            }

            output = output + currentBlock;
        }
        
        // last line
        output = output + endWith(prefix + "}", suffix, length) + "\n";
        
        return output;
    }

    public static void main(String[] args) {
        
//        String[][] testArr =
//        {
//            {"Hi", "Guy"},
//            {"2D"},
//            {"Michael", "LaCasse"}
//        };
//        
//        System.out.println(arrToString(testArr, "_", "!", 15));
        
        String[][][] testArr = {
                {
                    {"Hi", "Guy"},
                    {"2D"}
                },
                {
                    {"Eclipse", "Vim", "EMACS"},
                    {}
                },
                {
                    {"Michael", "Elliott"},
                    {"James", "Karen"},
                    {"ABC", "DEF", "GHI"}
                }
        };
        
        System.out.println(arrInBox(testArr, "_", "!?", '-', 45));
    }
    
    /**
     * Represents 3D array inside a box.
     * The left and right variables represent the sides of the box
     * and the divider is both the top and bottom (including corners).
     *
     * Example Output (left is "_", right is "!?",
     *      divider is '-", length is 15):
     * ---------------
     * _{           !?
     * _  {         !?
     * _    {Hi, Guy!?
     * _    {3D}    !?
     * _  }         !?
     * _------------!?
     * _  {         !?
     * _    {Nope}  !?
     * _  }         !?
     * _}           !?
     * ---------------
     *
     * @param arr The 3D array we're trying to represent as a String
     * @param left A String which should be at the start of
     *      every line of the 3D array representation
     * @param right A String which should be at the end of
     *      every line of the 3D array representation
     * @param divider A character to be repeated to divide blocks
     *      of 2D arrays and fill the top and bottom of the box
     * @param length The length of every line of the output
     * @return A String representing the boxed 3D array
     */
    public static String arrInBox(String[][][] arr, String left, String right, char divider, int length) {
        
        String output = "";
        
        // first line
        output = output + lineOf(divider, length) + "\n";
        
        output = output + arrToString(arr, left, right, divider, length);
        
        // last line
        output = output + lineOf(divider, length) + "\n";
        
        return output;
    }
}