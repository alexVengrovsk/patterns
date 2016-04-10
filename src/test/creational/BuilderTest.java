package creational;

import creational.builder.Computer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class BuilderTest {

    @Test
    public void generateComputerByBuilder() {

        Computer computer = new Computer.ComputerBuilder(1, 234, 34)
                .setProcessor("AMD")
                .setType("DeskTop")
                .build();

        assertNotNull(computer);
        assertTrue(computer instanceof Computer);
        assertEquals("AMD", computer.getProcessor());
    }
}
