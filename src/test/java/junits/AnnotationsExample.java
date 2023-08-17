package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class AnnotationsExample {

	@BeforeAll
	public static void beforeall() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforejunit() {
		System.out.println("Before Junit");
	}
	
	@Test
	public void test1() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);
	}

	@DisplayName("One positive one negative test")
	@Test
	public void test2() {
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1, result);
	}

	@Test
	public void test3() {
		int result = Calculator.add(1, 5);
		Assertions.assertEquals(10, result);
	}
	
	@AfterAll
	public static void afterall() {
		System.out.println("After All");
	}
	
	@AfterEach
	public void afterjunit() {
		System.out.println("After Junit");
	}
}
