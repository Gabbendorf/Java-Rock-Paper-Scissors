package game;

import move.Move;
import player.Computer;
import player.HumanPlayer;
import ui.Ui;

public class GameFlow {

    private final Ui ui;
    private HumanPlayer humanPlayer;
    private final Computer computer;

    public GameFlow(Ui ui, Computer computer) {
        this.ui = ui;
        this.computer = computer;
        gameSetUp();
    }

    public void run() {
        Move userMove = humanPlayer.makeMove(ui);

        Move computerMove = computer.makeMove(ui);

        printResult(userMove.playAgainst(computerMove));

        if (ui.playAgain().equals("yes")) {
            gameSetUp();
            run();
        } else {
            ui.sayBye();
        }
    }

    private HumanPlayer createNewPlayer() {
        return new HumanPlayer(ui.askForName());
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

    private void gameSetUp() {
        ui.askForLanguage();
        ui.welcomePlayer();
        humanPlayer = createNewPlayer();
    }
}
