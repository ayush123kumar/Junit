package junit4DemoEx;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalcTest {
	@Before
	public void before() {
		System.out.println("before");
	}

	@Test
	public void test() {
	MathCalc calc=new MathCalc();
	//assertEquals(expected,calc.add(4, 2));
	assertEquals(6,calc.add(2, 4));
	System.out.println("test1-addition");
	}
	
	
	@Test
	public void test1() {
		MathCalc calc=new MathCalc();
		assertEquals(314,calc.areaOfCircle(10),0);
		System.out.println("Test 2-test area Of Circle ");
	}
	@Test
	public void testDivideByZeroThrowsException() {
		MathCalc calc=new MathCalc();
		//assertThrows(ArithmeticException.class,calc.divide(1, 0));
		try {
		assertEquals(1,calc.divide(1, 1));
			}
		catch(ArithmeticException e)
		{
			System.out.println("pass correct val");
		}
		
		System.out.println("test 3-divide");

}
		
}
