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
        this.humanPlayer = humanPlayer;
        this.computer = computer;
    }

    public void run() {
        ui.welcomePlayer();
        Move userMove = humanPlayer.makeMove();
        ui.confirmMove(userMove.getName());
        Move computerMove = computer.makeMove();
        ui.declareComputerMove(computerMove.getName());
        String verdict = userMove.playAgainst(computerMove);
        if (verdict.equals(Results.WON.value)) {
            ui.declareWinner(humanPlayer.name());
        } else if (verdict.equals(Results.LOST.value)) {
            ui.declareWinner(computer.name());
        } else {
            ui.declareDraw();
        }
    }
}
