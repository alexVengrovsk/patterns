package structural.adapter;

/**
 * Created by 1 on 09.04.2016.
 */
public interface ReaderAdapter {

    String readChinese(String text);

    String readEnglish(String text);

    String readUrdu(String text);
}
