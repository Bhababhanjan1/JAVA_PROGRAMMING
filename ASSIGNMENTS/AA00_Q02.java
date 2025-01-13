package JAVA_PROGRAMMING.ASSIGNMENTS;
//Find the HCF & LCM of two numbers
import java.util.Scanner;
public class AA00_Q02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        int temp=0;
        //HCF
        for(i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                temp=i;
            }  

        }
        System.out.println("The HCF is: ");
        System.out.println(temp);
        //LCM
        int LCM=a*b/temp;
        System.out.println("The LCM is:");
        System.out.println(LCM);
        
        
    }
    
}
