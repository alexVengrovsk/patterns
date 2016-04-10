package structural.adapter;

/**
 * Created by 1 on 09.04.2016.
 */
public class ReaderAnyImpl implements ReaderAny {

    @Override
    public String processText(String text, String language) {
        return language.toUpperCase() + ": " + text ;
    }
}
