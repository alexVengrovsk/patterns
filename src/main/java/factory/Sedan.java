package factory;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class Sedan extends Vehicle {

    private int sits;
    private int weight;
    private String type;

    public Sedan(int sits, int weight, String type) {
        this.sits = sits;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public int getSits() {
        return this.sits;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getType() {
        return this.type;
    }

}
