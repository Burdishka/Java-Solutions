/*
8 kyu
Printing Array elements with Comma delimiters

https://www.codewars.com/kata/56e2f59fb2ed128081001328/java
*/

public class ArrayPrinter {

	public static <ANYTYPE> String printArray(ANYTYPE array[]) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				str += array[i] + ",";
			else
				str += array[i];
		}
		return str;
	}
}