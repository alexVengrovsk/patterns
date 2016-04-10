package creational.abstractFactory;

import creational.factory.MinyVan;
import creational.factory.Vehicle;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class MinyVanFactory implements AbstractVehicleFactory {

    private int sits;
    private int weight;
    private String type;

    public MinyVanFactory(int sits, int weight, String type) {
        this.sits = sits;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public Vehicle getVehicle() {
        return new MinyVan(sits, weight, type);
    }
}
