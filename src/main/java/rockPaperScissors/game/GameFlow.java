package rockPaperScissors.game;

import rockPaperScissors.move.Move;
import rockPaperScissors.player.Computer;
import rockPaperScissors.player.HumanPlayer;
import rockPaperScissors.ui.Ui;

import static rockPaperScissors.game.Result.LOST;
import static rockPaperScissors.game.Result.WON;

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

        printResult(userMove.playAgainst(computer.makeMove(ui)));

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

    private void printResult(Result verdict) {
        if (verdict == WON) {
            ui.declareWinner(humanPlayer.name());
        } else if (verdict == LOST) {
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
