package structural.adapter;

import org.springframework.stereotype.Component;

/**
 * Created by 1 on 09.04.2016.
 */
@Component
public class ReaderAdapterImpl extends ReaderImpl implements ReaderAdapter {

    private ReaderAny readerAny = new ReaderAnyImpl();

    @Override
    public String readChinese(String text) {
        return readText(text, "ch");
    }

    @Override
    public String readEnglish(String text) {
        return readText(text, "en");
    }

    @Override
    public String readUrdu(String text) {
        if (readerAny == null) System.out.print("Doesn't works here");
        return readerAny.processText(text, "urdu");
    }
}
