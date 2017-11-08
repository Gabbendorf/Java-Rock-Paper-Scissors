package rockPaperScissors.language;

public interface Language {

    String chooseLanguageMessage();

    String repeatLanguageMessage();

    String welcomeMessage();

    String nameMessage();

    String moveMessage();

    String translateIntoValidMove(String chosenMove);

    String repeatMoveMessage();

    String movePlayedMessage(String userName, String moveChosen);

    String computerMoveMessage(String computerMove);

    String winnerMessage(String winnerName);

    String drawMessage();

    String newGameMessage();

    String convertAnswer(String answer);

    String repeatAnswerMessage();

    String byeMessage();
}
