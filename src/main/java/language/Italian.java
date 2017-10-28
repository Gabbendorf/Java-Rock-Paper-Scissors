package language;

import move.Moves;

import java.util.HashMap;
import java.util.Map;

public class Italian implements Language {

    private final Map<String, String> translator;

    public Italian() {
        translator = new HashMap<>();
        translator.put("sasso", Moves.ROCK.name);
        translator.put("carta", Moves.PAPER.name);
        translator.put("forbici", Moves.SCISSORS.name);
        translator.put(Moves.ROCK.name, "sasso");
        translator.put(Moves.PAPER.name, "carta");
        translator.put(Moves.SCISSORS.name, "forbici");
        translator.put("si", "yes");
        translator.put("no", "no");
    }

    public String chooseLanguageMessage() { return "Scegli la lingua:";}

    public String repeatLanguageMessage() {
        return "Lingua non valida, ripeti:";
    }

    public String welcomeMessage() {
        return "*** Benvenuti a Carta-Forbici-Sasso ***";
    }

    public String nameMessage() {
        return "Come ti chiami?";
    }

    public String moveMessage() {
        return "Fai la tua mossa:";
    }

    public String translateIntoValidMove(String chosenMove) {
        return translator.get(chosenMove);
    }

    public String repeatMoveMessage() {
        return "Non ho capito, ripeti la mossa:";
    }

    public String movePlayedMessage(String userName, String moveChosen) {
        return String.format("%s ha giocato la mossa %s.", userName, translator.get(moveChosen));
    }

    public String computerMoveMessage(String computerMove) {
        return String.format("Computer ha giocato la mossa %s.", translator.get(computerMove));
    }

    public String winnerMessage(String winnerName) {
        return String.format("%s ha vinto!", winnerName);
    }

    public String drawMessage() {
        return "E'patta!";
    }

    public String newGameMessage() {
        return "Vuoi fare un'altra partita?";
    }

    public String convertAnswer(String answer) { return translator.get((answer)); }

    public String repeatAnswerMessage() {
        return "Non ho capito: si o no?";
    }

    public String byeMessage() {
        return "Ciao ciao!";
    }
}