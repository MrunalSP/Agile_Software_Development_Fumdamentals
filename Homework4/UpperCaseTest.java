package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class UpperCaseTest {

	@Test
	public void test() {
		TestClass test = new TestClass();
		String result = test.toUpperCase("camelCase");
		assertEquals("CAMELCASE",result);
	}
	

}
