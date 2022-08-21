package StrPack;

import static org.junit.Assert.*;
import org.junit.Test;



public class StringCalculatorTest {

	

	
	StringCalculator sc = new StringCalculator();
	
	@Test
	public void testWithEmptyString() throws Exception {
		assertEquals(sc.add(""),0);
	}
	
	@Test
	public void testWithOneNum() throws Exception {
		assertEquals(sc.add("1"),1);
	}
	
	@Test
	public void testWithTwoNum() throws Exception {
		assertEquals(sc.add("5,2"),7);
	}
	
	@Test
	public void testWithUnlimitedNum() throws Exception {
		assertEquals(sc.add("500,2,4,6,8,30"),550);
	}
	
	@Test
	public void testWithAlphabets() throws Exception {
		assertEquals(sc.add("5,7,b,c"),17);
	}

	@Test
	public void testWithGreaterThan1000() throws Exception{
		assertEquals(sc.add("5,1020,7,d"),16);
	}
	
	@Test
	public void testWithSingleNegativeValue()throws Exception {
		 try {
	            sc.add("-17");
	        } catch (NegativeException.NoNegativesAllowed e) {
	            assertEquals(e.getMessage(), "Negatives Not Allowed. Numbers are: -17 ");
	        }
	}
	
	@Test
	public void testWithMultipleNegativeValue()throws Exception {
		 try {
	            sc.add("-17,-18,10");
	        } catch (NegativeException.NoNegativesAllowed e) {
	            assertEquals(e.getMessage(), "Negatives Not Allowed. Numbers are: -17 -18 ");
	        }
	}

}
