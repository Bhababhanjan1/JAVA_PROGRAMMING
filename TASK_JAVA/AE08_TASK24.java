package JAVA_PROGRAMMING.TASK_JAVA;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
//USING FUNCTIONS
import java.util.Scanner;
public class AE08_TASK24 {
    
    public static void num(int a)
    {    
        Scanner sc=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zeroes=0;
        
       while(a==1)
       {
        System.out.println("Enter numbers:");
        int b=sc.nextInt();
        if(b>0)
        {
            positive++;
        }
        if(b<0)
        {
            negative++;
        }
        else{
            zeroes++;
        }
        System.out.println("DO YOU WANT TO CONTINUE? (1 or 0)");
        a=sc.nextInt();
        
       }
       System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeroes);
        
       
       
    }
    public static void main(String[] args) {
        System.out.println("Enter a choice!!");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1)
        {
            num(a);
            
        }
        else
        return;
        
    }

}

