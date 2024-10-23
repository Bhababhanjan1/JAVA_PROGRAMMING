package JAVA_PROGRAMMING.CORE_JAVA;
//AGE CHECK
import java.util.Scanner;
public class A5_Condition_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("YOU ARE ADULT!!");
            
        }
    
    else{
        System.out.println("YOU ARE MINOR!!");
    }
}
}
