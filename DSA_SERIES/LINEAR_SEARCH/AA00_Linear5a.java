package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Searching a particular element in a 2D Array
import java.util.Scanner;
import java.util.Arrays;
public class AA00_Linear5a {
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
        int ar[]=search(arr,target);
        System.out.println(Arrays.toString(ar));
       
    
}
static int[] search(int arr[][],int target)
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            if(arr[i][j]==target)
            {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{-1,-1};

}
}
