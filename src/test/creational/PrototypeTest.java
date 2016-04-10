package creational;

import creational.prototype.Prototype;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 1 on 09.04.2016.
 */
public class PrototypeTest {

    private Prototype prototype;

    @Before
    public void init() {
        prototype = new Prototype();
        prototype.collect();
    }

    @Test
    public void prototypeTest() {

        assertNotNull(prototype);
        assertFalse(prototype.getList().isEmpty());
        assertFalse(prototype.getList().contains("d"));
    }

    @Test
    public void prototypingTest() {

        Prototype prototyped = (Prototype) prototype.clone();
        List<String> list = prototyped.getList();
        list.add("d");

        assertNotNull(prototyped);
        assertTrue(prototyped instanceof Prototype);
        assertTrue(prototyped.getList().contains("d"));
    }
}
