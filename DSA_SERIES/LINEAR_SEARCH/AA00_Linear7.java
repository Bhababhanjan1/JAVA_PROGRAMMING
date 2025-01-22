package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;


//LEETCODE - 2 - Finding the maximum wealth that a richest person have.
import java.util.*;
public class AA00_Linear7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row and column:");
        int row =sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter the element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("The Array is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int a= maximumWealth(arr);
        System.out.println(a);
        
    }
    public static int maximumWealth(int[][] accounts) {
        //person =row
        //account=col
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            //when you start a new col, take a new sum for that row
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                
                sum+=accounts[person][account];
            }
            if(sum>ans)
            {
                ans=sum;
            };
        }
        return ans;

}
}
