package app;

public class Game {
    public int winner(){
        char Winner = ' ';
        int temp = 0;
        char board[] = new char[10];

        // Check if X wins
        if (board[1] == 'X' && board[2] == 'X' && board[3] == 'X') Winner = 'X';
        if (board[4] == 'X' && board[5] == 'X' && board[6] == 'X') Winner = 'X';
        if (board[7] == 'X' && board[8] == 'X' && board[9] == 'X') Winner = 'X';
        if (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') Winner = 'X';
        if (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') Winner = 'X';
        if (board[3] == 'X' && board[6] == 'X' && board[9] == 'X') Winner = 'X';
        if (board[1] == 'X' && board[5] == 'X' && board[9] == 'X') Winner = 'X';
        if (board[3] == 'X' && board[5] == 'X' && board[7] == 'X') Winner = 'X';
        if (Winner == 'X' ) {
            System.out.println("X võitis" );
            temp = 1;
        }

        // Check if O wins
        if (board[1] == 'O' && board[2] == 'O' && board[3] == 'O') Winner = 'O';
        if (board[4] == 'O' && board[5] == 'O' && board[6] == 'O') Winner = 'O';
        if (board[7] == 'O' && board[8] == 'O' && board[9] == 'O') Winner = 'O';
        if (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') Winner = 'O';
        if (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') Winner = 'O';
        if (board[3] == 'O' && board[6] == 'O' && board[9] == 'O') Winner = 'O';
        if (board[1] == 'O' && board[5] == 'O' && board[9] == 'O') Winner = 'O';
        if (board[3] == 'O' && board[5] == 'O' && board[7] == 'O') Winner = 'O';
        if (Winner == 'O' ){
            System.out.println("O võitis" );
            temp = 1;
        }

        return temp;
    }
}