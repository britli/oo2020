package app;

public class Board{
   
    int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    
    public void getBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "+ board[i][j]);
            }
        }
}


    
}