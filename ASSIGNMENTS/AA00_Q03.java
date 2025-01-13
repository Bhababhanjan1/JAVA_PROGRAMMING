package JAVA_PROGRAMMING.ASSIGNMENTS;
// Linear Search (using methods)
import java.util.Scanner;
public class AA00_Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,11,22,33,44,55,21,78,99,57,20,81,41};
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();
        int result= Linear(arr,target);
        
        if(result!=0)
        {
            System.out.println("The element is found at index: "+result);
        }
        else{
            System.out.println("The element is not found!!!");
        }
      
    }
    //Search in the Array , Return the index if the item found 
    //Otherwise return -1;
    static int Linear(int a[],int target)
    {
       if(a.length==0)
       {
        return -1;
       }
       for(int i=0;i<a.length;i++)
       {
        if(a[i]==target)
        {
            return i;      
        }
       }
       //If the target is not found the execute this

       return -1;
    }
    
}
