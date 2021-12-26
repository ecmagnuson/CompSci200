///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           printing arrays
// Course:          CS200
//
// Author:          Elliott Magnuson
// Email:           ecmagnuson@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

public class PrintArray{
    public static void print(int[][] list){
        
    for (int i = 0; i < list.length; i++) {
        int count = 0;
        for (int j = 0; j < list[i].length; j++) {
            count = count + list[i][j];
            System.out.print(list[i][j] + " ");
            
        }
        System.out.print(count);
        System.out.println();
        
    }        
}
    
    public static void main(String[] args) {
        int[][] array = {{1,2}, {3,4,5}, {6}};

        print(array);
        
    }
}
