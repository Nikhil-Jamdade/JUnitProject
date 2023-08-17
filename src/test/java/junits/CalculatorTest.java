   package junits;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class CalculatorTest {

	@RepeatedTest(2)
	@Test
	@CustomAnnotation
	public void test1() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);
	}

	@DisplayName("One positive one negative test")
	@Test
	@Tag("Regression")
	public void test2() {
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1, result);
	}

//	@Disabled
	@DisplayName("Two positive number test where result is not matching")
	@Test
	@Tag("Sanity")
	public void test3() {
		int result = Calculator.add(1, 5);
		Assertions.assertNotEquals(10, result);
	}
}