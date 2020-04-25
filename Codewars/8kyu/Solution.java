/*
8 kyu
Remove exclamation marks
https://www.codewars.com/kata/57a0885cbb9944e24c00008e

Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
*/

class Solution {
    static String removeExclamationMarks(String s) {
        
        String str = "";
        for (int i = 0; i < s.length(); i++)
        {
          if (s.charAt(i) == '!') continue;
          str += s.charAt(i);
        }
        return str;
    }
}