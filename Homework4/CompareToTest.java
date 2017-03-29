package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareToTest {

	@Test
	public void test() {
		TestClass passtest = new TestClass();
		int result = passtest.compareStrings("camelCase","camelCase");
		assertEquals(0,result);

		TestClass failtest = new TestClass();
		int failresult = failtest.compareStrings("camelCase","Case");
		assertEquals(32,failresult);

	}
	
	

}
