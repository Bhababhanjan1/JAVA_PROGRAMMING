package JAVA_PROGRAMMING.TASK_JAVA;
//CHECKING PRIME NUMBER
import java.util.Scanner;
public class AD_TASK5a {
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int a=sc.nextInt();
       if(a<=1)
       {
        System.out.println("It is not a prime number!!"); // Numbers less than or equal to 1 are not prime
       }
       else{
        for(int i=2;i<=a;i++)
        {
            if(a%i!=0)
            {
                System.out.println("It is a prime number!!"); // Found a divisor, so it's not prime
            }
            else
            {
                System.out.println("It is not a prime number!!");
                
            }
            break;
                      
        }
       }
}
}
