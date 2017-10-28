package game;

import player.Computer;
import language.English;
import language.Language;
import ui.Ui;

public class GameRunner {

    public static void main(String [] args) {
        Language english = new English();
        Ui ui = new Ui(System.out, System.in, english);
        Computer computer = new Computer();
        GameFlow gameFlow = new GameFlow(ui, computer);

        gameFlow.run();
    }
}
