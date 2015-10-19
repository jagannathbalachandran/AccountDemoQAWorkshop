import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.TestAccountDemoUsingEntityStep6;
import tests.PaymentTestExtendingBaseTestReadingFromConfigFileStep4;
import tests.Smoke;

/**
 * Created by jbalacha on 15/10/15.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses({TestAccountDemoUsingEntityStep6.class , PaymentTestExtendingBaseTestReadingFromConfigFileStep4.class})
public class SmokeTestSuite {

}
