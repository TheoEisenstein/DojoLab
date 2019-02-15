package katas;

import java.util.Scanner;

public class StringCalculator {

	
public static String add1(String input, String input2) {
		
	
		return input;
	}
	
public static String add(String input) {
	//In this commented out amateur bit of code, I discovered that the
	//test would run, but never end, as it waited for scanner input.
	//Scanner scnr = new Scanner(System.in);
	//input = scnr.nextLine();

	
	
	//	if (s=="") {
//		return "0";
//	}
	
	
	String noInput = "0";
	if (input.equals("")) {
		
		return noInput;
		
	}
	if (input == "0") {
		return "";
	}
	if(input.contains("-") && input.contains(",")) {
		String[] values = input.split(",");
		String value1 = values[0];
		String value2 = values[1];
		
		int x = Integer.parseInt(value1);
		int y = Integer.parseInt(value2);
		
		int preResult = x + y;
		
		String result = Integer .toString(preResult);
		return result;
	}
	
	if(input.contains("-")) {
		String result = input;
		return result;
	}
	
	
	if (input.contains(",") && input.contains(".")) {
		
		String[] values = input.split(",");
		String value1 = values[0];
		String value2 = values[1];
		
		double x = Double.parseDouble(value1);
		double y = Double.parseDouble(value2);
		
		double preResult = x+y;
		String result = Double.toString(preResult);
		
	return result;
	}
	if (input.contains(",")) {
	
		String[] values = input.split(",");
		String value1 = values[0];
		String value2 = values[1];
		
		int x = Integer.parseInt(value1);
		int y = Integer.parseInt(value2);
		
		int preResult = x+y;
		String result = Integer.toString(preResult);
		
	//return result;
	
	return result;
}else

return input;
}		
}			
		

	


