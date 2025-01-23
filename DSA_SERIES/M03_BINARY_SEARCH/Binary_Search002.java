package JAVA_PROGRAMMING.DSA_SERIES.M03_BINARY_SEARCH;
//Order Agnostic Binary Search
import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search002 {
    public static void main(String[] args) {
        int arr[]={87,72,71,64,58,53,51,30,29,20,8,5,1};
        System.out.println("The Given Array is :");
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        binary(arr, target);
        if(binary(arr, target)!=-1)
        {
        System.out.println("The element is found at:");
        System.out.println(binary(arr, target));
        }
        else
        System.out.println(binary(arr, target));
        System.out.println("Element not found!!!");
        

    }
    static int binary(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        //check wheather the array is in ascending or descending order.
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
           isAsc=false;
        }
        
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc){
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }     
        }
        else{
            if(target>arr[mid])
            {
                end=mid-1;
            }
            else if(target<arr[mid])
            {
                start=mid+1;
            }

        }
        }
        return -1;
    }
    
}
