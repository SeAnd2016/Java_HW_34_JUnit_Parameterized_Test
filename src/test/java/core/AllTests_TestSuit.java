package core;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// @RunWith(Categories.class)
@RunWith(Suite.class)

// @IncludeCategory(RegressionTest.class)
// @ExcludeCategory(AcceptanceTest.class)

@SuiteClasses({ Add2ParameterizedTest.class, Add3ParameterizedTest.class, Add4ParameterizedTest.class,
		Divide2ParameterizedTest.class, Divide3ParameterizedTest.class, Divide4ParameterizedTest.class,
		Multiply2ParameterizedTest.class, Multiply3ParameterizedTest.class, Multiply4ParameterizedTest.class,
		Subtract2ParameterizedTest.class, Subtract3ParameterizedTest.class, Subtract4ParameterizedTest.class })

public class AllTests_TestSuit {

}
