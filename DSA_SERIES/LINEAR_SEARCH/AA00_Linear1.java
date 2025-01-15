package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Searching a particular element of an array
import java.util.Scanner;
import java.util.Arrays;
public class AA00_Linear1 {
    public static void main(String[] args) {   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the Array:");
    int size=sc.nextInt();
    int a[]=new int [size];
    System.out.println("Enter the elements of the Array:");
    for(int i=0;i<size;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("The Array is:");
    
        System.out.println(Arrays.toString(a));
    
    System.out.println("Enter the target element");
    int target=sc.nextInt();
    int s=search(a,target);
    System.out.println(s);
    if(s!=-1)
    {
        System.out.println("The element is found");
    }
    else{
        System.out.println("The element is not found!!");
    }

    
}
//Search in the array : if found return the index
//other wise if not found return -1
static int search(int arr[],int target)
{
    if(arr.length==0)
    {
        return -1;
    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return i;
        }
    }
    //his line executes if none of the return statements above are executed
    //Hence terget  is not found
    return -1;
}
}
