package JAVA_PROGRAMMING.TASK_JAVA;
//CALCULATE POWER OF A NUMBER USING RECURSION
import java.util.Scanner;

public class AE08_TASK25 {
    
   public static void power(int a,int b)
    {
        int result=1;
        for(int i=1;i<=b;i++)
        {
             result=result*a;
            
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number:");
        int a=sc.nextInt();
        System.out.println("Enter number of times you want to calculate the power:");
        int b=sc.nextInt();
        power(a,b);

    }
}
