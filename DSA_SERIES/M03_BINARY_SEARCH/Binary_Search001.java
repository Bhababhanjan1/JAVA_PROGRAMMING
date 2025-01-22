package JAVA_PROGRAMMING.DSA_SERIES.M03_BINARY_SEARCH;
//INTRODUCTION TO BINARY SEARCH
import java.util.Scanner;
public class Binary_Search001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,9,11,12,14,20,36,48};
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        System.out.println("The element is found at:");
        int r=binary_search(arr, target);
        System.out.println(r);
        
         
    }
    //return the index
    //return -1 if it does not exist
    static int binary_search(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //find the middle element
            //int mid=(start+end)/2;
             //might be possible that (start+end) exceeds the range of integers
             int mid=start+(end-start)/2;
             if(target>arr[mid])
             {
                end=mid-1;
             }
             else if(target<arr[mid]){
                start=mid+1;
             }
             else
             {
                //ans
                return mid;
             }
             
        }
        return -1;
        
    }
}
