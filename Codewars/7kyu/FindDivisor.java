/*
7 kyu
Count the divisors of a number

https://www.codewars.com/kata/542c0f198e077084c0000c2e
*/

public class FindDivisor {

  public long numberOfDivisors(int n) {
    int count = 2;
    for (int i = 2; i <= n / 2; i++){
      if (n % i == 0) count++;
    }
    return (n == 0)? 0 : count;
  }

}