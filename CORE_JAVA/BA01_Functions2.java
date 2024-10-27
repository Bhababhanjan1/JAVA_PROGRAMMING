package JAVA_PROGRAMMING.CORE_JAVA;
//MULTIPLY TWO NUMBERS USING FUNCTION
import java.util.Scanner;
public class BA01_Functions2 {
    public static int multiply(int x,int y)
    {
        int mul=x*y;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println( "Enter the first number");
        int  a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("The multiplation is: "+multiply(a,b));


    }
    
}
