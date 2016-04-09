import creational.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by 1 on 09.04.2016.
 */
@RunWith(Suite.class)
@SuiteClasses({AbstractFactoryTest.class,
    BuilderTest.class,
    FactoryTest.class,
    SingletonTest.class,
    PrototypeTest.class})
public class CreationalPatternsTestSuite {
}
