import creational.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by Alex 2016_1
 *
 * tests
 */
@RunWith(Suite.class)
@SuiteClasses({AbstractFactoryTest.class,
    BuilderTest.class,
    FactoryTest.class,
    SingletonTest.class,
    PrototypeTest.class})
public class CreationalPatternsTestSuite {
}
