 package katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * input(number)       result
 * ""                     "0"
 * "7"                    "7"
 * "100"                  "100"
 * "2,3"                  "5"
 * "0"                    null
 * "1,100"                "101"
 * "7.5, 8.1"            "15.6"
 */

public class StringCalculatorTest {

	//Initial attempt to understand what was going on. Renamed to a second method called add1. 
	//Leaving this here for my own learning process notes.
	@Test
	void test1() {
		// This test will take two strings that are number ("7" or "8" for example) and add them together.
		String input = "5";
		String input2 = "10";
		String expected = "15";
		
		StringCalculator.add1(input,input2);
		
		
		// act
		int math1 = Integer.parseInt(input);		
		int math2 = Integer.parseInt(input2);
		
		int preResult = math1+math2;
		
		String result = Integer.toString(preResult);
		
		// assert 
		assertEquals(expected, result);
		
	}
	@Test
	void test2() {
		
		//String input = ""; This is redundant, because when you call StringCalculator.add(""), it is already using that input.
		String expected = "0";
		String actual = StringCalculator.add("");
		
		assertEquals(expected, actual);
		
	}
	@Test
	void test3() {
		//String input = "7";
		String expected = "7";
		String actual = StringCalculator.add("7");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		String expected = "100";
		String actual = StringCalculator.add("100");
		
		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		String expected = "5";
		String actual = StringCalculator.add("2,3");
		
		
		
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void test6() {
		String expected = "101";
		String actual = StringCalculator.add("1,100");
		
		
		assertEquals(expected, actual);
	}
	@Test
	void test7() {
		String expected = "15.6";
		String actual = StringCalculator.add("7.5,8.1");
		
		assertEquals(expected, actual);
	}
	@Test
	void test8() {
		String expected = "-65";
		String actual = StringCalculator.add("-65");
		
		assertEquals(expected, actual);
	}
	@Test
	void test9() {
		String expected = "-61";
		String actual = StringCalculator.add("-65,4");
		
		assertEquals(expected, actual);
		
	}
	@Test
	void test10() {
		String expected = "-89";
		String actual = StringCalculator.add("-65,-24");
		
		assertEquals(expected, actual); 
				
	}
	@Test
	void test11() {
		String expected = "";
		String actual = StringCalculator.add("0");
		
		assertEquals(expected, actual);
	}
	@Test
	void test12() {
		String expected = "27";
		String actual = StringCalculator.add("21,6");
		
		assertEquals(expected, actual);
	}
	@Test
	void test13() {
		String expected = "-5";
		String actual = StringCalculator.add("20,-25");
		
		assertEquals(expected, actual);
	}
}
