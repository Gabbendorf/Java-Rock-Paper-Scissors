package game;

public enum Results {

    WON("won"), LOST("lost"), DRAW("draw");

    Results(String message) {
        value = message;
    }

    public String value;
}
