package HW001;

public class Task03 {

	public static void main(String[] args) {
		long longValue = 544;
		int intValue = 2323;
		byte byteValue = 78;
		short shortValue = 11238;
		float floatValue = 1545434.345544f;
		double doubleValue = 3457845.58776;
		
		sumOfByteAndShort(byteValue, shortValue);
		sumOfLongAndInt(longValue, intValue);
		sumOfFloatAndDouble(floatValue, doubleValue);
		sumOfIntAndDouble(intValue, doubleValue);
	}

	private static void sumOfByteAndShort(byte byteValue, short shortValue) {
		System.out.println(byteValue + shortValue);
	}

	private static void sumOfLongAndInt(long longValue, int intValue) {
		System.out.println(longValue + intValue);
	}

	private static void sumOfFloatAndDouble(float floatValue, double doubleValue) {
		System.out.println(floatValue + doubleValue);
	}

	private static void sumOfIntAndDouble(int intValue, double doubleValue) {
		System.out.println(intValue + doubleValue);
	}
}
