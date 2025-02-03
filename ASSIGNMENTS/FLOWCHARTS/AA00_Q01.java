package JAVA_PROGRAMMING.ASSIGNMENTS.FLOWCHARTS;
//Check a year is a leap year or not
import java.util.*;
public class AA00_Q01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int a=sc.nextInt();
        if(a%400==0 || a%4==0 && a%100!=0 )
        {
            System.out.println("It is a leap year !");
        }
        else{
            System.out.println("Ut not a leap year!");
        }
       
        
    
    }
    
}
