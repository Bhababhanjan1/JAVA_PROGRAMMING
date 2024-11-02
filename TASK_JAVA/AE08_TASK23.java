package JAVA_PROGRAMMING.TASK_JAVA;
//Check prime number using functions
import java.util.Scanner;
public class AE08_TASK23 {
    public static void prime(int a)
    {
        if(a==0||a==1)
        {
            System.out.println("It is not a prime number!!");
        }
        else
        {
            for(int i=2;i<=a;i++)
            {
                if(a%i==0)
                {
                    System.out.println("It is not a prime number");
                }
                else
                {
                    System.out.println("It is a prime number");
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("PLZ ENTER A NUMBER!!");
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        prime(v);
    }
}
