package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Finding Maximum and Minimum element of the Array using Linear Search
import java.util.Scanner;
import java.util.Arrays;
public class AA00_Linear4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int a=sc.nextInt();
        int ar[]=new int [a];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("Enter the element at index "+i+" :");
             ar[i]=sc.nextInt();
        }
        System.out.println("The Array is:");
        System.out.println(Arrays.toString(ar));
        max(ar);
        min(ar);
    }
    static void max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                
                
            }
        }
        System.out.println("The Maximum element of the Array is: "+max);
    }
    static void min(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The minimum element of the Array is: "+min);
    }
    
}
