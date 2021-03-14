package HW001;

public class Task02 {

	public static void main(String[] args) {
		long longValue = 50;
		int intValue = 29;
		byte byteValue = 89;
		short shortValue = 138;
		float floatValue = 134.34f;
		double doubleValue = 345.56;

		int result1 = byteValue + shortValue;
		long result2 = longValue + intValue;
		double result3 = floatValue + doubleValue;
		double result4 = intValue + doubleValue;

		System.out.println(result1 + "\n" + result2 + "\n" + 
				   result3 + "\n" + result4);
	}
}

