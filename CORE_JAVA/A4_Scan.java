package JAVA_PROGRAMMING.CORE_JAVA;
//Taking input from user
import java.util.*;//import all  the  Packages
import java.util.Scanner;//importing the Scanner package
public class A4_Scan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Defining a  Scanner object and taking input from user
        System.out.println("Enter a Name");
          
        String name1=sc.nextLine();//Takes more than 1 token
        System.out.println(name1);
        String Name=sc.next();//Takes only a single token
        System.out.println(Name);

    }
    
}
