/*
8 kyu
Simple Fun #1: Seats in Theater

https://www.codewars.com/kata/588417e576933b0ec9000045
*/

public class Seats {

  public static int seatsInTheater(int nCols, int nRows, int col, int row) {
  
    return (nRows - row) * (nCols - col + 1);
    
  }

}