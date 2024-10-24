package JAVA_PROGRAMMING.CORE_JAVA;
//Checking number equality,Greater than or Lesser than
import java.util.Scanner;
public class A7_Condition_if_else2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:-");
        int a=sc.nextInt();
        System.out.println("Enter the Second number:-");
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("a is equl to b");
            
        }
      else{
        if(a>b)
        {
            System.out.println("a is greater than b.");
        }
        else{
            System.out.println("a is smaller than b.");
        }
      }
    
    }
}
