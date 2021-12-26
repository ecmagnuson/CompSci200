package Problems;

public class MultidimensionalArrays {
    
    public static void main(String[] args) {
    
        int [][] board;
        board = new int[][]{{1,2},{4,5,6}};
        
        for ( int j = 0; j < board.length; ++j) {
            for ( int i = 0; i < board[j].length; ++i) {
                System.out.print(board[j][i]);
            }
        }
    }
} 
