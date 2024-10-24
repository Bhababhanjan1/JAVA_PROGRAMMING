package JAVA_PROGRAMMING.CORE_JAVA;
//SWITCH CASE IN JAVA
import java.util.Scanner;
public class A9_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("CALCULATOR");
        System.out.println("----------");
        System.out.println("Enter 1st number:-");
        a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        b=sc.nextInt();
        System.out.println("ENTER A CHOICE>>>");
        System.out.println("1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULO");
        int choice;
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            if(choice==1)
            {
                System.out.println("The ADDITION is:"+(a+b));
            }
            break;
            case 2:
            if(choice==2)
            {
                System.out.println("The SUBSTRACTION IS:"+(a-b));
            }
            break;
            case 3:
            if(choice==3)
            {
                System.out.println("The MULTIPLICATION is:"+(a*b));
            }
            break;
            case 4:
            if(choice==4)
            {
                System.out.println("The DIVISION is:"+(a/b));
            }
            break;
            case 5:
            if(choice==5)
            {
                System.out.println("The Remainder is:"+(a%b));
            }

            default:
            System.out.println("INVALID CHOICE!");
        }
    }
    
}
