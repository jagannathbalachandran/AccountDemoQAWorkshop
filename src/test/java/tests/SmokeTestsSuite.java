package tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jbalacha on 15/10/15.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses({AccountDemoTestUsingEntityStep6.class , PaymentTestExtendingBaseTestReadingFromConfigFileStep4.class})
public class SmokeTestsSuite {

}
