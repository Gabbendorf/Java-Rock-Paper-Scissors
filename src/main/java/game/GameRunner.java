package game;

import player.Computer;
import ui.Ui;

public class GameRunner {

    public static void main(String [] args) {
        Ui ui = new Ui(System.out, System.in);
        Computer computer = new Computer();
        GameFlow gameFlow = new GameFlow(ui, computer);

        gameFlow.run();
    }
}
