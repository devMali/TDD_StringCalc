package StrPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator sc = new StringCalculator();
	
	@Test
	public void testWithEmptyString() {
		assertEquals(sc.add(""),0);
	}
	
	@Test
	public void testWithOneNum() {
		assertEquals(sc.add("1"),1);
	}
	
	@Test
	public void testWithTwoNum() {
		assertEquals(sc.add("5,2"),7);
	}
	
	

}
