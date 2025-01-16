package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Seaching a particular element in an Array within a given range using Linear Search
import java.util.Scanner;
import java.util.Arrays; 
public class AA00_Linear3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input the size of the Array
        System.out.println("Enter the size of the Array:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        //Creating a method to add elements of the Array
        add(arr);
        System.out.println("The Array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a element to be searched:");
        int b=sc.nextInt();
        System.out.println("Enter the range within which the element is to be searched:");
        int s=sc.nextInt();
        int t=sc.nextInt();
        int h=search(arr,b,s,t);
        if(h!=-1)
        {
            System.out.println("Element is found!!");
        }
        else{
            System.out.println("Element not found!!");
        }
    }
    static void add(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+i+"th element of the Array:");
            arr[i]=sc.nextInt();
        }
    }
    static int search(int arr[],int b,int s,int t)
    {
        if(arr.length==0){
            return -1;
        }
        for(int i=s;i<=t;i++)
        {
            if(b==arr[i]){
                System.out.println("Element found at index "+i);
                return i;
            }
        }
        return -1;
    }
    
}
