package app;

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int win = 0;
        Game Game = new Game();
        int winner = 0;
        Game.start('X');

        while(winner == 0){
            System.out.println(Game.getPlayer() + " kord käia");
            boolean taken = true;
            Game.PrintBoard();
            System.out.println("Vali positsioon 1 - 9");
            while(taken){
                win = input.nextInt();
                taken = Game.checkPlacement(win);
            }
            Game.place(Game.getPlayer(), win);
            winner = Game.winner();
            Game.tie();

            Game.getTurn();
        }
    }
}