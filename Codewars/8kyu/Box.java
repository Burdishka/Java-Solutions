/*
 8 kyu
 Surface Area and Volume of a Box
 
 Write a function that returns the total surface area and volume of a box as an array: [area, volume]
*/

public class Box {
    public static int[] getSize(int w,int h,int d) {
        int s1 = w * d * 2;
        int s2 = w * h * 2;
        int s3 = h * d * 2;
        int v = w * h * d;
        int arr[] = new int [2];
        arr[0] = s1 + s2 + s3;
        arr[1] = v;
        return arr;
    }
}