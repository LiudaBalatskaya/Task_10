/**
 * Created by LiudaBalatskaya on 5/5/2017.
 */

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses({MathematicsTest.class, TestMethodOrder.class})
public class TestExcludeFastRunner {
}
