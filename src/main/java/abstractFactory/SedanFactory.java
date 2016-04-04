package abstractFactory;

import factory.MinyVan;
import factory.Sedan;
import factory.Vehicle;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class SedanFactory implements AbstractVehicleFactory {

    private int sits;
    private int weight;
    private String type;

    public SedanFactory(int sits, int weight, String type) {
        this.sits = sits;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public Vehicle getVehicle() {
        return new Sedan(sits, weight, type);
    }
}
