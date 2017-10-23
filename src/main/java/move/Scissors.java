package move;

public class Scissors implements Move {

    private String name;

    public Scissors(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        StringBuilder verdict = new StringBuilder();
        if (opponentMove.getName() == "paper") {
            verdict.append("won");
        } else if (opponentMove.getName() == "rock"){
            verdict.append("lost");
        } else {
            verdict.append("draw");
        }
        return verdict.toString();
    }

    public String getName() {
        return name;
    }
}
