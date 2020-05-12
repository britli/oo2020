package app;

public class Circle implements Piece{
    String player;
    boolean position;

    public Circle(){
        player = "O";
    }


    @Override
    public boolean getPosition() {
        return position;
    }
}