package JAVA_PROGRAMMING.TASK_JAVA;
//Menu driven program
import java.util.Scanner;
public class AD_TASK4 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        do{
            System.out.println("Enter number 1 or 0:");
            i=sc.nextInt();
            switch(i)
            {
                case 1:
                {
                System.out.println("Enter your mark:");
                j=sc.nextInt();
                if(j>=90)
                {
                    System.out.println("This is good!");
                }
                else if(j<=89 && j>=60)
                {
                    System.out.println("This is also good!!");
                }
                else
                {
                    System.out.println("This is good as well!!!");
                }
                break;
            }
            case 0 :
            {
                return;
            }
            default:
            {
            System.out.println("THANK YOU FOR VISITING (:");
            }
        }
           
           
        }
        while(i==1);
    
    }
}
