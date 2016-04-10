package creational.singleton;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {}

    private static class SingletonProvider {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonProvider.INSTANCE;
    }
}
