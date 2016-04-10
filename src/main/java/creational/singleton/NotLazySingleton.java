package creational.singleton;

/**
 * Created by Alex Veng on 03.04.2016.
 */
public class NotLazySingleton {

    private NotLazySingleton() {}

    private static final NotLazySingleton instance = new NotLazySingleton();

    public static NotLazySingleton getInstance() {
        return instance;
    }
}
