package com.techelevator;

public class KataStringCalculator {

	public static Object addString(String calc) {
		// TODO Auto-generated method stub
	
		String[] result2 = calc.split(",");
		int var = 0;
		if (calc.equals("")) {
			return 0;	
		}
		for (String number : result2) {
			var += Integer.parseInt(number);
			
		}
	return var;
}
	
	public Object add(String string) {
		int result = 0;
		String[] temp = string.split("\\n|,");
		if (string.equals("")) {
			return 0;
		}
			for(String num: temp) {
				result += Integer.parseInt(num);
			}
		return result;
	}

	
}


