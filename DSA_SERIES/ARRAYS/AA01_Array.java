package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
//Taking input in array
import java.util.Scanner;
public class Array001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //TYPE-1
        int a[]=new int [3]; //Array declaration and initialisation
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println("The array a[] is:");
        //for loop for displaying the output
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //TYPE-2
        int b[]=new int[3]; //Array declaration and initialisation
        System.out.println("Enter the elements of array b[]");
        //for loop for taking input
        for(i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt(); //Taking input from user
        }
        System.out.println("The array b[] is:");
        //for loop for printing array / displaying the output
        for(i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        //TYPE-3
        int c[]=new int[3];
        for(i=0;i<c.length;i++)
        {
            c[i]=sc.nextInt();
        }
        System.out.println("The array c[] is : ");
        // for each loop
        for(int num : c) // for every element in array , print the element 
        {
            System.out.print(num+" "); //here num represents the element of the array
        }

    }
    
}
