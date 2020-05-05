/*
7 kyu
Shortest Word

https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
*/

import java.util.Arrays;

public class Length {
    public static int findShort(String s) {
       int count = 0;
       int min = 0;
       String[] str = s.split(" ");
       for (int i = 0; i < str.length; i++){
         for (int j = 0; j < str[i].length(); j++){
           count++;
         }
         if (min == 0) min = count;
         if (count < min) min = count;
         count = 0;
       }
       return min;
    }
}