/*
7 kyu
Exes and Ohs

https://www.codewars.com/kata/55908aad6620c066bc00002a
*/

public class XO {
  
  public static boolean getXO (String str) {
    int x = 0;
    int o = 0;
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'x') x++;
      if (str.charAt(i) == 'o') o++;
    }
    return x == o;
  }
}