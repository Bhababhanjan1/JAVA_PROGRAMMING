package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
//Printing a 2D array by taking input from user
import java.util.*;
public class AA03_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number of rows of an array:");
        int b=sc.nextInt();
        System.out.println("Enter the number odf columns of an array:");
        int c=sc.nextInt();
        int a[][]=new int [b][c];
        for( i=0;i<b;i++)
        {
            for( j=0;j<c;j++)
            {
               System.out.printf("Enter the [%d][%d] element of the array" ,i,j);
               System.out.println();
               
                a[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("The array is :");
        for(i=0;i<b;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
