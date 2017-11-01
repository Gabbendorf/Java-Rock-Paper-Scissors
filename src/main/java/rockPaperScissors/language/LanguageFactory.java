package rockPaperScissors.language;

public class LanguageFactory {

    public Language newLanguage(String languageChosen) {
        if (languageChosen.equals(Languages.ITALIAN.name)) {
            return new Italian();
        }
        return new English();
    }
}
