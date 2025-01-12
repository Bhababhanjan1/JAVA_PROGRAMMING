package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Searching a particular number in an Array
import java.util.Arrays; 
import java.util.Scanner;
public class AA00_Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        int i;  
        for(i=0;i<a;i++)
        {
            System.out.println("Enter the ["+i+"th] element of the Array: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the searching number from the Array :");
        int b=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(arr[i]==b)
            {
                System.out.println("The number is found at "+i+"th position");
                break;
            }
            
        }
       

    }
}
