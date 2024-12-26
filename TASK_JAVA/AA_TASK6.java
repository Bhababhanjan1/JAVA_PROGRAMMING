package JAVA_PROGRAMMING.TASK_JAVA;

import java.util.Scanner;

//Fibonnaci series (FOR LOOP)
public class AA_TASK6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the element in the fibonacci series:");
        int a=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        System.out.println("The fibonacci series is: ");
        System.out.print(n1+" "+n2);       
        for(int i=2;i<=a;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            
        }
    }
}
