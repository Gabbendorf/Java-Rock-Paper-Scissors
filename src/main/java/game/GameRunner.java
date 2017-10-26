package game;

import player.Computer;
import player.HumanPlayer;
import ui.Ui;

public class GameRunner {

    public static void main(String [] args) {
        Ui ui = new Ui(System.out, System.in);
        HumanPlayer humanPlayer = new HumanPlayer("Gabriella", ui);
        Computer computer = new Computer();
        GameFlow gameFlow = new GameFlow(ui, humanPlayer, computer);

        gameFlow.run();
    }
}
