package creational.factory;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public abstract class Vehicle {

    public abstract int getSits();
    public abstract int getWeight();
    public abstract String getType();

    @Override
    public String toString() {
        return this.getType();
    }
}
