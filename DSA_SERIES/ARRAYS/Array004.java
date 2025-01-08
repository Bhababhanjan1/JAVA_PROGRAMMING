package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
// Taking input from user and printing it
import java.util.Arrays;
import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[][]=new int[3][2];
       
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.printf("Enter the [%d][%d] element of tye array",i,j);
                System.out.println();
            
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        // TYPE_2 PRINTING

        for(int i=0;i<b.length;i++)
        {
            System.out.println(Arrays.toString(b[i]));
        }

        //TYPE 3 PRINTING
        for(int a[] :b)
        {
            System.out.println(Arrays.toString(a));
        }
    }
    
}
