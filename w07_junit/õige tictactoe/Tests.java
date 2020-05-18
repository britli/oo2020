package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
    Game Testing = new Game();

    @Test
    public void test1() {
        Testing.start('O');
        Testing.place(Testing.getPlayer(), 1);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 2);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 4);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 3);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 7);
        assertEquals(1, Testing.winner());
    }

    @Test
    public void test2(){
        Testing.start('X');
        Testing.place(Testing.getPlayer(), 1);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 3);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 2);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 5);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 4);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 6);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 9);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 8);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 7);
        assertEquals(1, Testing.tie());
    }


    @Test
    public void test3() {
        Testing.start('X');
        Testing.place(Testing.getPlayer(), 3);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 8);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 5);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 9);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 7);
        assertEquals(1, Testing.winner());
    }

    @Test
    public void test4(){
        Testing.start('X');
        Testing.place(Testing.getPlayer(), 1);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 5);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 7);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 4);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 6);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 2);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 8);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 9);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 3);
        assertEquals(1, Testing.tie());
    }

    @Test
    public void test5() {
        Testing.start('O');
        Testing.place(Testing.getPlayer(), 5);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 7);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 8);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 2);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 9);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 3);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 1);
        assertEquals(1, Testing.winner());
    }

    @Test
    public void test6() {
        Testing.start('X');
        Testing.place(Testing.getPlayer(), 3);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 9);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 6);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 5);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 2);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 4);
        Testing.getTurn();
        Testing.place(Testing.getPlayer(), 1);
        assertEquals(1, Testing.winner());
    }


}