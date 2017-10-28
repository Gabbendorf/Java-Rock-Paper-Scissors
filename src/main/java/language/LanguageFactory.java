package language;

public class LanguageFactory {

    public Language newLanguage(String languageChosen) {
        if (languageChosen.equals(Languages.ITALIAN.name)) {
            return new Italian();
        } else if (languageChosen.equals(Languages.ENGLISH.name)) {
            return new English();
        }
        return new English();
    }
}
