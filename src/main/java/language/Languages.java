package language;

import java.util.Arrays;
import java.util.List;

public enum Languages {

    ITALIAN("italiano"), ENGLISH("english");

    public String name;

    Languages(String language) { name = language; }

    static public List availableLanguages() {
        return Arrays.asList(ITALIAN.name, ENGLISH.name);
    }
}
