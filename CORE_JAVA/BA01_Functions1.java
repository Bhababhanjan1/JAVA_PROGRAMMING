package JAVA_PROGRAMMING.CORE_JAVA;
//MAKE A FUNCTION TO ADD 2 NUMBERS AND RETURN THE SUM
import java.util.Scanner;
public class BA01_Functions1 {
    public static int sum(int x,int y)
    {
        int result=x+y;
        System.out.println("The sum is "+result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1st Number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b=sc.nextInt();
        sum(a,b);
        
    }
}
