package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
// Taking input from user and printing it
import java.util.Arrays;
import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[3][2];
       
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
