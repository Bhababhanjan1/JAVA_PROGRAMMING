package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;

import java.util.Arrays;

// 2-D Array printing
public class AA02_Array {
    public static void main(String[] args) {
        //Syntax:  data_type [][] =new int[size of row  (mandatory) ]   [size of column (not mandatory) ]
        int b[][]=new int [2][3];
        //TYPE_1 : Printing 2-D array with fixed values
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // Here each individual object is an array itself. 
        System.out.println(Arrays.toString(arr[0])); //Printing the first array
        System.out.println(Arrays.toString(arr[1])); //Printing the second array
        System.out.println(Arrays.toString(arr[2])); //Printing the third array
        //Printing each individual element of array
        System.out.println(arr[0][0]); //Printing the first element of first array
        System.out.println(arr[1][1]); //Printing the second element of second array
        System.out.println(arr[2][2]); //Printing the third element of third array
        //Printing the entire 2D array
        System.out.println(Arrays.deepToString(arr)); //Printing the entire 2-D array



    
}
}
