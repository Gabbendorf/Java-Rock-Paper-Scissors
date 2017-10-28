package language;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItalianTest {

    @Test
    public void translatesItalianWordForRockIntoAcceptedMoveInEnglish() {
        Italian italian = new Italian();

        String englishWord = italian.translateIntoValidMove("sasso");

        assertEquals("rock", englishWord);
    }

    @Test
    public void translatesItalianWordForPaperIntoAcceptedMoveInEnglish() {
        Italian italian = new Italian();

        String englishWord = italian.translateIntoValidMove("carta");

        assertEquals("paper", englishWord);
    }

    @Test
    public void translatesItalianWordForScissorsIntoAcceptedMoveInEnglish() {
        Italian italian = new Italian();

        String englishWord = italian.translateIntoValidMove("forbici");

        assertEquals("scissors", englishWord);
    }

    @Test
    public void translatesRockIntoItalian() {
        Italian italian = new Italian();

        String italianWord = italian.translateIntoValidMove("rock");

        assertEquals("sasso", italianWord);
    }

    @Test
    public void translatesPaperIntoItalian() {
        Italian italian = new Italian();

        String italianWord = italian.translateIntoValidMove("paper");

        assertEquals("carta", italianWord);
    }

    @Test
    public void translatesScissorsIntoItalian() {
        Italian italian = new Italian();

        String italianWord = italian.translateIntoValidMove("scissors");

        assertEquals("forbici", italianWord);
    }
}
