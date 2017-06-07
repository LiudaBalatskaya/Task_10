import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by LiudaBalatskaya on 5/5/2017.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(FastTests.class)
@Categories.ExcludeCategory(SlowTests.class)
@Suite.SuiteClasses({MathematicsTest.class, TestMethodOrder.class} )
public class TestExcludeSlowRunner {
}
