package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import code.StringFunctions;

public class StringFunctionsTest {
	
	@Test
	@Tag("Regression")
	public void test1() {
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}
	@Test
	@Tag("Sanity")
	public void test2() {
		Assertions.assertFalse(StringFunctions.isPalindrome("Nikhil"));
	}
	
}
