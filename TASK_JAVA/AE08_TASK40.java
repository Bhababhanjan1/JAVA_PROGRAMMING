package JAVA_PROGRAMMING.TASK_JAVA;
//TAKE A INPUT FROM USER , SEARCH FOR A GIVEN NUMBER X AND PRINT THE INDEX AT WHICH IT OCCURS
import java.util.Scanner;
public class AE08_TASK40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a=sc.nextInt();
        int num[]=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.printf("Enter the %dth element of the array",i);
            System.out.println();
            num[i]=sc.nextInt();
        }
        System.out.println("The elements are: ");
        for(int i=0;i<num.length;i++) // LENGTH IS THE BY DEFAULT PROPERTY WHICH IS EQUAL TO SIZE
        {
           //Taking input from user
           System.out.println(num[i]);
        }
       
        System.out.println("Enter the searching number:");
        int x=sc.nextInt();
        for(int i=0;i<a;i++)
        {
          if(num[i]==x)
          {
            System.out.printf("The number is found at %dth position.",i);
            System.out.println();
          }
          
        }
    }
}
