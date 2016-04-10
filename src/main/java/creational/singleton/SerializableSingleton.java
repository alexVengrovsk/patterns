package creational.singleton;

import java.io.Serializable;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class SerializableSingleton implements Serializable {

    private SerializableSingleton() {}

    private static class SerializableSingletonProvider {
        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SerializableSingletonProvider.INSTANCE;
    }

    /**
     * Prevent creational.singleton from destroying by serialization
     * @return instance of the <b>SerializableSingleton</b>
     */
    protected Object readResolve() {
        return getInstance();
    }
}
