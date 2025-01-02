package JAVA_PROGRAMMING.CORE_JAVA;
//Swaaping two numbers using function
import java.util.Scanner;
public class BA02_Methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The numbers before swapping are :-");
        System.out.println("a = "+a);  
        System.out.println("b = "+b);
        //Printing the original value of a and b
        System.out.println("The two numbers after swapping are :- ");
        swap(a, b);
        //Printing the swapped value of a and b
        
       
       
        
    }
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
    }
}
