package JAVA_PROGRAMMING.TASK_JAVA;
import java.util.Scanner;
//Checking a number is prime or not using while loop
public class AA_TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int c=2;
        while(c<num)
        {
            if(num%c==0)
            {
                System.out.println("Its not a prime number!");
            }
            c=c+1;
        }
        System.out.println("Its a prime number!!");
    }
}
