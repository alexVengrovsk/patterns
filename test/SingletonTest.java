import org.junit.Test;
import singleton.NotLazySingleton;
import singleton.StaticBlockSingleton;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by Alex Veng on 03.04.2016.
 */
public class SingletonTest {

    @Test
    public void notLazySingletonTest() {


        NotLazySingleton singletoneFirst = NotLazySingleton.getInstance();
        NotLazySingleton singletoneSecond = NotLazySingleton.getInstance();

        assertTrue(singletoneFirst instanceof NotLazySingleton);
        assertTrue(singletoneFirst == singletoneSecond);

    }

    @Test
    public void staticBlockSingletonTest() {


        StaticBlockSingleton singletonFirst = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singletonSecond = StaticBlockSingleton.getInstance();

        assertTrue(singletonFirst instanceof StaticBlockSingleton);
        assertTrue(singletonFirst == singletonSecond);

    }
}
