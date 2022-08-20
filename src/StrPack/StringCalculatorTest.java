package StrPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator sc = new StringCalculator();
	@Test
	public void testWithEmptyString() {
		assertEquals(sc.add("0"),0);
	}

}
