package zyLabsChapter8;

public class ArrayTesting2 {


	public static void main(String args[]) {
        String s = "Hello, World!";
       
       char[] oldCharArray = s.toCharArray();
       char[] newCharArray = new char[oldCharArray.length];
       char delimiter = ',';
       int indexDelimiter = new String(oldCharArray).indexOf(delimiter);
       int i = 0;
       for (i = 0; i < oldCharArray.length-indexDelimiter-1; i++) {
           newCharArray[i] = oldCharArray[indexDelimiter + i + 1];
       }
       newCharArray[i] = delimiter;
       i++;
       int j = i;
       while (i < oldCharArray.length) {
           newCharArray[i] = oldCharArray[i - j];
           i++;
       }  
       System.out.println(newCharArray);
    }

}
