package tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(Regression.class)
@Suite.SuiteClasses({PaymentTestExtendingBaseTestReadingFromConfigFileStep4.class , AccountDemoTestUsingEntityStep6.class})
public class RegressionTestsSuite {

}
