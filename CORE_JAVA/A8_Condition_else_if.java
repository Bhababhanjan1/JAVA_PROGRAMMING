package JAVA_PROGRAMMING.CORE_JAVA;
//Checking number equality,Greater than or Lesser than
import java.util.Scanner;
public class A8_Condition_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        if(a==b)
        System.out.println("a is equal to b.");
        else if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is smaller than b");
        }
    }
}
