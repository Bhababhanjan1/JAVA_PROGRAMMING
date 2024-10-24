package JAVA_PROGRAMMING.TASK_JAVA;

import java.util.Scanner;

//BASIC CALCULATOR
public class AB_TASK2 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        //Declarartion of variable
        System.out.println("CALCULATOR");
        System.out.println("----------");
        System.out.println("Enter 1st number:-");
        a=sc.nextInt();//Taking input from user
        System.out.println("Enter 2nd number:");
        b=sc.nextInt();//Taking input from user
        System.out.println("ENTER A CHOICE>>>");
        System.out.println("1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULO");
        int choice;
        choice=sc.nextInt();//Taking input from user
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

            default://If  choice is not in the above cases

            System.out.println("INVALID CHOICE!");
        }
    }
    
}
