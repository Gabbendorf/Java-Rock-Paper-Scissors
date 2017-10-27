package game;

import move.Move;
import player.Computer;
import player.HumanPlayer;
import ui.Ui;

public class GameFlow {

    private final Ui ui;
    private final HumanPlayer humanPlayer;
    private final Computer computer;

    public GameFlow(Ui ui, HumanPlayer humanPlayer, Computer computer) {
        this.ui = ui;
        ui.welcomePlayer();
        this.humanPlayer = humanPlayer;
        this.computer = computer;
    }

    public void run() {
        Move userMove = humanPlayer.makeMove();

        Move computerMove = computer.makeMove();
        ui.declareComputerMove(computerMove.getName());

        printResult(userMove.playAgainst(computerMove));

        if (ui.playAgain().equals("yes")) {
            run();
        } else {
            ui.sayBye();
        }
    }

    private void printResult(String verdict) {
        if (verdict.equals(Results.WON.value)) {
            ui.declareWinner(humanPlayer.name());
        } else if (verdict.equals(Results.LOST.value)) {
            ui.declareWinner(computer.name());
        } else {
            ui.declareDraw();
        }
    }
}
