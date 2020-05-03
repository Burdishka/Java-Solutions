/*
8 kyu
Formatting decimal places #0

https://www.codewars.com/kata/5641a03210e973055a00000d
*/

public class Numbers
{
  public static double TwoDecimalPlaces(double n)
  {  
    return (double)Math.round(n * 100) / 100;
  }
}