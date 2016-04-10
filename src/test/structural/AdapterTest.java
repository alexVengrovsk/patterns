package structural;

import org.junit.Test;
import structural.adapter.ReaderAdapter;
import structural.adapter.ReaderAdapterImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 09.04.2016.
 */
public class AdapterTest {

    @Test
    public void adapterTest() {

        ReaderAdapter readerAdapter = new ReaderAdapterImpl();
        String resultCh = readerAdapter.readChinese("text");
        String resultUr = readerAdapter.readUrdu("text");
        assertEquals("Chinese: text", resultCh);
        assertEquals("URDU: text", resultUr);
    }
}
