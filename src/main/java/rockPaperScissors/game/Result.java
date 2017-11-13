package rockPaperScissors.game;

public enum Result {

    WON("won"), LOST("lost"), DRAW("draw");

    Result(String message) {
        value = message;
    }

    public String value;
}
