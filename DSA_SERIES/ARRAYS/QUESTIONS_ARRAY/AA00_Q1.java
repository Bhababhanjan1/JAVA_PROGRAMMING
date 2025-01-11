package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS.QUESTIONS_ARRAY;
// SWAPPING ELEMENTS IN ARRAY
import java.util.Scanner;
import java.util.Arrays;
public class AA00_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter the position of first element to be swapped :");
        int a=sc.nextInt();
        System.out.println("Enter the position of second element to be swapped :");
        int b=sc.nextInt();
        swap(arr,a,b);
        System.out.println("After swapping the array is: ");
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
       arr[a]=arr[b];
        arr[b]=temp;
    }
}
