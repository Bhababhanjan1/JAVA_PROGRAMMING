package JAVA_PROGRAMMING.CORE_JAVA;
//FACTORIAL USING FUNCTION
import java.util.Scanner; //Scanner Library
public class BA02_Factorial {
    static int fact_01=1;
    public static int fact(int num)
    {
        for(int i=1;i<=num;i++)
        {
            fact_01=fact_01*i;
            System.out.println(fact_01);
           
            
        }
        return fact_01;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        
        System.out.println( "Factorial of "+a+" is "+fact(a));

    }
}
