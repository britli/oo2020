package app;

public class Cross implements Piece{
    String player;
    boolean position;

    public Cross(){
        player = "X";
    }


    @Override
    public boolean getPosition() {
        return position;
    }
}