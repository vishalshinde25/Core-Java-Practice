
public class RangeofDataTypes {
	public static void main(String[] args) {
		int minByte = Byte.MIN_VALUE;
		int maxByte = Byte.MAX_VALUE;
		System.out.println("Range of Byte: "+minByte+" to "+maxByte);
		int minShort = Short.MIN_VALUE;
		int maxShort = Short.MAX_VALUE;
		System.out.println("Range of Short: "+minShort+" to "+maxShort);
		int minInt= Integer.MIN_VALUE;
		int maxInt= Integer.MAX_VALUE;
		System.out.println("Range of Integer: "+minInt+" to "+maxInt);
		long minLong= Long.MIN_VALUE;
		long maxLong= Long.MAX_VALUE;
		System.out.println("Range of Long: "+minLong+" to "+maxLong);
		int minChar= Character.MIN_VALUE; // Return type is Integer
		int maxChar= Character.MAX_VALUE;
		System.out.println("Range of Character: "+minChar+" to "+maxChar);
	}
}

//Output:
//Range of Byte: -128 to 127
//Range of Short: -32768 to 32767
//Range of Integer: -2147483648 to 2147483647
//Range of Long: -9223372036854775808 to 9223372036854775807
//Range of Character: 0 to 65535
