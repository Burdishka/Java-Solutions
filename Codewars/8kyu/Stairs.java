/*
8 kyu
How many stairs will Suzuki climb in 20 years?

https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e
*/

public class Stairs
{
    public static long stairsIn20(int[][] stairs)
    {
       int sum = 0;
       for (int i = 0; i < stairs.length; i++){
         for (int j = 0; j < stairs[i].length; j++){
           sum += stairs[i][j];
         }  
       }
       return sum * 20;
    }
}