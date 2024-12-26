package JAVA_PROGRAMMING.TASK_JAVA;
import java.util.*;
// Alphabet case check 
public class AA_TASK5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c=sc.next().trim().charAt(0);
        if(c>='a'&& c<='z')
        {
            System.out.println("Its a smaller case character!");
        }
        else{
            System.out.println("Its a Upper case letter!");
        }
    }
}
