package Problems;

public class NestedArrayLoop {

    public static void main(String[] args) {

        int [][] board;
        board = new int[][]{{1,2},{4,5,6}};
        
        for (int i = 0; i < board.length; ++i) {
           for (int j = 0; j < board[i].length; ++j) {
              System.out.println(board[i][j]);
           }
        }
    }
}
