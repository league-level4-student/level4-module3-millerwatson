package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide (double numerator, double denominator) {
		if (denominator == 0.0) {
			throw new IllegalArgumentException();
		}
		return numerator/denominator;
	}
	
	String reverseString (String s) {
		if (s.equals("")) {
			throw new IllegalStateException();
		}
		String newString = "";
		for (int i = s.length() - 1; i > -1; i--) {
			newString = newString + s.charAt(i);
		}
		return newString;
	}
}
