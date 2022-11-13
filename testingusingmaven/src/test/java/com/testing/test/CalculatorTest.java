package com.testing.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {
	Calculator cal;
	@BeforeAll
	static void beforeAllInit()
	{
		System.out.println("This will execute before all test cases");
	}
	
	@AfterAll
	static void afterAllInit()
	{
		System.out.println("This will execute after all test cases");
	}
	@BeforeEach
	void init()
	{
		cal = new Calculator();
	}
	@AfterEach
	void cleanUp()
	{
		cal=null;
		System.out.println("Cleanup...");
	}
	
	
	
	@Test
	@DisplayName("Testing Factorial method")
	@DisabledOnOs(value= {OS.MAC})
	@DisabledOnJre(value = {JRE.JAVA_18})
	@EnabledForJreRange(min = JRE.JAVA_11, max= JRE.JAVA_17)
	void testFactorial() {
	
		System.setProperty("job", "dev");
		assumeFalse("dev".equals(System.getProperty("job")), CalculatorTest::message); //then rest run else abort
		//if above assumption is false then then rest run else abort
		assertEquals(120, cal.factorial(5));
	}
	@Nested
	@DisplayName("Nested class for all add methods")
	class TestAddition{
	@Test
	@DisplayName("Testing Addition method")
	@EnabledOnOs(value = {OS.LINUX, OS.WINDOWS})
	void testAddition() {
		boolean f=true;
		assumeTrue(f);//we are assuming f has to be true, then rest run else abort
		//if above assumption is true then then rest run else abort
		assertEquals(10, cal.addition(10, 5),"this test method should test addition value of two int numbers");
		
	}
	@Test
	@DisplayName("testing exception")
	@EnabledOnJre(value= {JRE.JAVA_8,JRE.JAVA_17})
	public void testAdditionWithExample() {
		assertThrows(ArithmeticException.class,
				()->cal.additionWithException(0, 10));
		
	}
	
	@Test
	@DisplayName("Adding two negative number")
	public void  addTwoNegativeNo()
	{
		assertEquals(10, cal.addition(-5, -10),"this test method should test addition value of two int numbers");
	}
	@Test
	@DisplayName("Adding two posetive number")
	public void  addTwoPosetiveNo()
	{
		assertEquals(150, cal.addition(50, 100),"this test method should test addition value of two int numbers");
	}
	}	// end of nested class
	@Test
	void testMultiply()
	{
		assertAll(
				()->assertEquals(4, cal.multiple(2, 2)),
				()->assertEquals(0, cal.multiple(2, 0)),
				()->assertEquals(-2, cal.multiple(2, -1))
				);
	}
	@Test
	@DisplayName("this method should not run")
	@Disabled
	void testDisabled() {
	
		fail("this test should be disabled");
	}
	private static String message()
	{
		return "Test execution is failed";
	}
	
	//@RepeatedTest(3)
	@RepeatedTest(value = 3)
	public void testFindMax()
	{
		System.out.println("Repeated test");
//		int arr[]=new int[] {1,3,19,69,2};
//		assertEquals(69, cal.findMax(arr));
		assertEquals(-1,cal.findMax(new int[] {-1, -10, -3, -6}));
	}
	@Test
	@DisplayName("to check null and true")
	public void test() {
	
		int num=6;
		String name="nill";
		
		//check false condition
		assertFalse(num>10);//asserting condition should be false
		
		//check true condition
		assertTrue(num>10);//asserting condition should be true
		
		//check for not null
		assertNotNull(name);//expecting name should not null
		
		//check for null
		assertNull(name);//expecting null
	}
}
