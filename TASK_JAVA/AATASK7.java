package JAVA_PROGRAMMING.TASK_JAVA;
//Fibonacci series (WHILE LOOP)
import java.util.Scanner;
public class AATASK7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n3;
        System.out.println("Enter the nth fibonacci number:");
        int num=sc.nextInt();
        System.out.println("The fibonacci number is: ");
        System.out.print(n1+" "+n2);
        int i=2;
        while(i<=num)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            i++;
            n1=n2;
            n2=n3;
        }
    }
}
