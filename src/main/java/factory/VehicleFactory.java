package factory;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class VehicleFactory {

    public static Vehicle getVehicle(int index, int sits, int weight, String type) {
        switch (index) {
            case 1: return new Sedan(sits, weight, type);
            case 2: return new MinyVan(sits, weight, type);
        default: return null;
        }
    }
}
