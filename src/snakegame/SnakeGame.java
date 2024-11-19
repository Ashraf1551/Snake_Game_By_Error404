package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game Error404");
        add(new Board());
        pack();
        //setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }

}
