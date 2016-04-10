package structural.adapter;

/**
 * Created by 1 on 09.04.2016.
 */
public class ReaderImpl implements Reader {

    @Override
    public String readText(String text, String language) {
        if ("en".equals(language.toLowerCase())) {
            return readEnglish(text);

        } else if ("ch".equals(language.toLowerCase())) {
            return readChinese(text);
        }
        return "";
    }

    private String readChinese(String text) {
        return "Chinese: " + text;
    }

    private String readEnglish(String text) {
        return "English: " + text;
    }
}
