/*
8 kyu
Hex to Decimal

Complete the function which converts hex number (given as a string) to a decimal number.
*/

public class Kata {

	public static int hexToDec(final String hexString) {
		int result = Integer.parseInt(hexString, 16);
		return result;
	}

}