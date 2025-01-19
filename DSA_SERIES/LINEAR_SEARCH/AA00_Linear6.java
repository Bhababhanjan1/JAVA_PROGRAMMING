package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Find the numbers having even number of digits in an Array using Linear Search --LEETCODE
import java.util.Scanner;
import java.util.Arrays;
public class AA00_Linear6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of elements having even number of digits is:");
        System.out.println(countDigits(arr));
       

    }
    static int countDigits(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
        if(even(arr[i]))
        {
            count++;
        }
    }
    return count;
}     
    //Function to check wheather a number contains even no. of digits or not
    static boolean even(int num)
    {
        int numberofdigits=digits(num);
        if(numberofdigits % 2==0)
        {
            return true;
        }
        return false;

    }
    //Count the number of digits in a number
    static int digits(int num){
        //Convert negative numbers into positive
        if(num<0)
        {
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    
}
