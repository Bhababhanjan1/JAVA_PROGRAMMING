package JAVA_PROGRAMMING.CORE_JAVA;
//INTRODUCTION TO FUNCTION
import java.util.Scanner; //input library
public class BA00_Fuction_and_Method {
    public static void PrintMyName(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:"); //Taking input from  user
        String name = sc.nextLine();
        PrintMyName(name); //Function calling
    }
}
