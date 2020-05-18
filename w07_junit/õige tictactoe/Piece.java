package app;

public interface Piece {
    
    void start(char symbol);
    void getTurn();
    void place(char symbol, int pos);
    boolean checkPlacement(int pos);
    
}