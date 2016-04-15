import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import structural.AdapterTest;
import structural.CompositionTest;

/**
 * Created by 1 on 09.04.2016.
 */
@RunWith(Suite.class)
@SuiteClasses({AdapterTest.class, CompositionTest.class})
public class StructuralPatternsTestSuite {
}
