package JAVA_PROGRAMMING.TASK_JAVA;
import java.util.Scanner;
//Checking a number is prime or not using for loop
public class AA_TASK2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=sc.nextInt(); //Taking input from user
        if(num<=1)
        {
            System.out.println("Its neither a prime number nor a composite number!");
        }
        else if(num==1||num==2){
            System.out.println("Its a prime number!");
        }
        else{
            for(int c=2;c*c<=num;c++)    //for(int c=2;c<sqrt(num);c++)
            {
                if(num%c==0)
                System.out.println("Its not a prime number!!");
            }
            System.out.println("Its a prime number!!");
        }
    }
    
}
