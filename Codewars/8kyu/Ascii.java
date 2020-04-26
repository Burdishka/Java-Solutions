/*
8 kyu
get character from ASCII Value

Write a function which takes a number and returns the corresponding ASCII char for that value.

Example:

Ascii.getChar(65) // => 'A'
For ASCII table, you can refer to http://www.asciitable.com/ 
*/

public class Ascii {
  public static char getChar(int c) {
    char ch = (char) c;
    return ch;
  }
}