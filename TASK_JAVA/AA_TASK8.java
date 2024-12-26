package JAVA_PROGRAMMING.TASK_JAVA;
//Occurence check of number program
import java.util.Scanner;
public class AA_TASK8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("The number is "+a);
        System.out.println("Enter a the number to find the no. of times it occured: ");
        int b=sc.nextInt();
        int count=0;
        while(a>0)
        {
            int rem=a%10;
            if(rem==b)
            {
                count++;
            }
            a=a/10;
        }
        System.out.println("The number "+b+" appeared "+count+" times!");
    }
    
}
