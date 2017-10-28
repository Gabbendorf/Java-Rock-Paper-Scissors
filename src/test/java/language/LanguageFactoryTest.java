package language;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class LanguageFactoryTest {

    @Test
    public void createsNewItalian() {
        LanguageFactory languageFactory = new LanguageFactory();

        String languageChosen = "italiano";

        assertTrue(languageFactory.newLanguage(languageChosen) instanceof Italian);
    }

    @Test
    public void createsNewEnglish() {
        LanguageFactory languageFactory = new LanguageFactory();

        String languageChosen = "english";

        assertTrue(languageFactory.newLanguage(languageChosen) instanceof English);
    }
}
