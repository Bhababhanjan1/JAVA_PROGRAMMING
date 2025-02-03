package JAVA_PROGRAMMING.ASSIGNMENTS;
// Printing the table of a number
import java.util.Scanner;
public class Q002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get the multiplication table of:");
        int a=sc.nextInt();
        System.out.println();
        System.out.println("MULTIPLICATION TABLE OF "+a);
        System.out.println("_________________________");
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
    
}
