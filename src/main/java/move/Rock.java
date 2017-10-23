package move;

public class Rock implements Move {

    private String name;

    public Rock(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        StringBuilder verdict = new StringBuilder();
        if (opponentMove.getName() == "scissors") {
            verdict.append("won");
        } else if (opponentMove.getName() == "paper"){
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
