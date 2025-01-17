package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Searching a particular element in a 2D Array
import java.util.Scanner;
import java.util.Arrays;
public class AA00_Linear5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("The Array is :");
        for( i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter a element from the Array:");
        int target=sc.nextInt();
       boolean b= search(arr,target);
       if(b!=false)
       {
        System.out.println("Element is found!");
       }
       else{
        System.out.println("Element is not found!");
       }
        
    }
    static boolean search(int arr[][],int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target)
                {
                    System.out.println("The element is found at index ["+i+"]["+j+"]");
                    return true;
                }
                
            }
        }
        return false;
    }
    
    
}
