package creational.abstractFactory;

import creational.factory.Vehicle;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class VehicleGeneratorFactory {

    public static Vehicle getVehicle(AbstractVehicleFactory factory) {
        return factory.getVehicle();
    }
}
