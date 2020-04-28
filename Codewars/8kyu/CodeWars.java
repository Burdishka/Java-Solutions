/*
8 kyu
All Star Code Challenge #18

This Kata is intended as a small challenge for my students

All Star Code Challenge #18

Create a function called that accepts 2 string arguments and returns an integer of the count
of occurrences the 2nd argument is found in the first one.

If no occurrences can be found, a count of 0 should be returned.

	strCount('Hello', 'o') // => 1
	strCount('Hello', 'l') // => 2
	strCount('', 'z')      // => 0

Notes:

* The first argument can be an empty string
* The second string argument will always be of length 1
*/

public class CodeWars {
  public static int strCount(String str, char letter) {
    int count = 0;
    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i) == letter) count++;
    }  
    return count;
  }
  
}