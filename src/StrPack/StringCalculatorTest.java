package StrPack;

import static org.junit.Assert.*;
import org.junit.Test;



public class StringCalculatorTest {
	
	StringCalculator sc = new StringCalculator();
	
	@Test
	public void testWithEmptyString(){
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
	
	@Test
	public void testWithUnlimitedNum() {
		assertEquals(sc.add("500,2,4,6,8,30"),550);
	}
	
	@Test
	public void testWithAlphabets() {
		assertEquals(sc.add("5,7,b,c"),17);
	}

	@Test
	public void testWithGreaterThan1000() {
		assertEquals(sc.add("5,1020,7,d"),16);
	}
	
	@Test
	public void testWithSingleNegativeValue() {
		 try {
	            sc.add("-17");
	        } catch (NegativeException.NoNegativesAllowed e) {
	            assertEquals(e.getMessage(), "Negatives Not Allowed: -17 ");
	        }
	}
	
	@Test
	public void testWithMultipleNegativeValue() {
		 try {
	            sc.add("10,22,-11,18,-25");
	        } catch (NegativeException.NoNegativesAllowed e) {
	            assertEquals(e.getMessage(), "Negatives Not Allowed: -11 -25 ");
	        }
	}
	
	@Test
	public void testWithNewLine() {
		assertEquals(sc.add("5\n6,n,7"),32);
	}
	
	@Test
	public void testWithDifferentDelimiters() {
		assertEquals(sc.add("//;\n1;k;2;a"),15);
	}
	
	
	@Test
	public void testWithOddEvenAddition() {
		assertEquals(sc.add("1//[***]\n1***2***3***4***5"),6);
	}
	
	@Test
	public void testWithOddEvenAddition2() {
		assertEquals(sc.add("0//[***]\n1***2***3***4***5"),9);
	}
}
