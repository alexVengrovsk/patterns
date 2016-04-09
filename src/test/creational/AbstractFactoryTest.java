package creational;

import abstractFactory.MinyVanFactory;
import abstractFactory.SedanFactory;
import abstractFactory.VehicleGeneratorFactory;
import factory.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest() {

        Vehicle sedan = VehicleGeneratorFactory.getVehicle(new SedanFactory(2, 3, "sedan"));
        Vehicle minyVan = VehicleGeneratorFactory.getVehicle(new MinyVanFactory(6, 4, "minyVan"));

        assertEquals("sedan", sedan.getType());
        assertEquals("minyVan", minyVan.getType());
    }
}
