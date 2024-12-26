
package JAVA_PROGRAMMING.TASK_JAVA;
import java.util.*;
//Checking the largest of three numbers using Math class
public class AA_TASK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(c,Math.max(a, b));
        System.out.println("The largest number is: "+max);
        
    }
    
}
