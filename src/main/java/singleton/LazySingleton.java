package singleton;

/**
 * Created by Alex Veng on 04.04.2016.
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

 //   public static synchronized LazySingleton getInstance() {
      public static LazySingleton getInstance() {
//        System.out.println(Thread.currentThread().getName());
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    System.out.println(Thread.currentThread().getName());
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
