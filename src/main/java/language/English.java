package language;

public class English implements Language {

    public String chooseLanguageMessage() { return "Please choose a language:"; }

    public String repeatLanguageMessage() {
        return "Invalid language, please repeat:";
    }

    public String welcomeMessage() {
        return "*** Welcome to Rock-Paper-Scissors ***";
    }

    public String nameMessage() {
        return "Please type your name:";
    }

    public String moveMessage() {
        return "Please type your move:";
    }

    public String translateIntoValidMove(String chosenMove) {
        return chosenMove;
    }

    public String repeatMoveMessage() {
        return "Invalid move. Please type your move again:";
    }

    public String movePlayedMessage(String userName, String moveChosen) {
        return String.format("%s played %s.",userName, moveChosen);
    }

    public String computerMoveMessage(String computerMove) {
        return String.format("Computer played %s.",computerMove);
    }

    public String winnerMessage(String winnerName) {
        return String.format("%s won!",winnerName);
    }

    public String drawMessage() {
        return "It's a draw!";
    }

    public String newGameMessage() {
        return "Do you want to play again?";
    }

    public String convertAnswer(String answer) {return answer; }

    public String repeatAnswerMessage() {
        return "I didn't understand: yes or no?";
    }

    public String byeMessage() {
        return "Bye bye!";
    }

}
