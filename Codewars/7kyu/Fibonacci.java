/*
7 kyu
Fibonacci

https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af
*/

public class Fibonacci {
  public static long fib (int n){ 
    long f1 = 1;
    long f2 = 1;
    if (n == 1) return f1;
    if (n == 2) return f2;
    long f3 = f1 + f2;
    int i = 3;
    while (i <= n){
      f3 = f1 + f2;
      f1 = f2;
      f2 = f3;
      i++;
    }
    return f3;
  }
}