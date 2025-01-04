package JAVA_PROGRAMMING.TASK_JAVA;
//Checking prime number using functions
import java.util.Scanner;
public class AD_TASK5b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int a=sc.nextInt();
        prime(a);
    }
    static void prime(int n)
    {
        int c=2;
        if(n<=1)
        {
            System.out.println("Its not a prime number!");
        }
        else if(n==2||n==3)
        {
            System.out.println("Its a prime number!!");
        }
        else
        {
        for(c=2;c*c<=n;c++)
        {
            if(n%c==0)
            {
                System.out.println("Its not a prime number!");
            }
        }
        System.out.println("Its a prime number!");
    }
    }
    
}
