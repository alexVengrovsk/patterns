package singleton;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public enum EnumSingleton {

    INSTANCE;

    public static void doSmth() {
        System.out.println("Enum singleton");
    }
}
