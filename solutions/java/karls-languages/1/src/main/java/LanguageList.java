import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);

    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String firstLanguage = languages.getFirst();
        return firstLanguage;
    }

    public int count() {
        int langNumb = languages.size();

        return langNumb;
    }

    public boolean containsLanguage(String language) {
        boolean isLangEmpty =languages.contains(language);
        return isLangEmpty;
    }

    public boolean isExciting() {


        if (languages.contains("Java")){
            return true;
        } else if (languages.contains("Kotlin")) {
            return true;
        }else {
            return false;
        }

    }
}
