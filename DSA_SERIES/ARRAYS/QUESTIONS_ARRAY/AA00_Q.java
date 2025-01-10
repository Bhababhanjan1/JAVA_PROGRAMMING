package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS.QUESTIONS_ARRAY;
//Swapping the elements of a 2D array 
import java.util.*;
public class AA00_Q {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;;
        int a[][]=new int[3][3];
        //Taking inputs by user
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter the element of array a at position ["+i+"]["+j+"]=");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        //Displaying the original array
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the row and column position of the element to be swapped:");
        int ab=sc.nextInt();
        int ba=sc.nextInt();
        System.out.println("Enter the position of the row and column of the element to swapped with:");
        int ac=sc.nextInt();
        int ca=sc.nextInt();
        swap(a,ab,ba,ac,ca);
        System.out.println("After swapping the array is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    static void swap(int a[][],int ab,int ba,int ac,int ca)
    {
        int temp =a[ab][ba];
        a[ab][ba]=a[ac][ca];
        a[ac][ca]=temp;
    }
}
