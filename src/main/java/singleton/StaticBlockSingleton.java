package singleton;

/**
 * Created by Alex Veng on 03.04.2016.
 */
public class StaticBlockSingleton {

    private StaticBlockSingleton() {}

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch(Exception e) {
            e.printStackTrace();
        };
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
