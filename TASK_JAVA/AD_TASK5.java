package JAVA_PROGRAMMING.TASK_JAVA;
//PRINTING THE TABLE OF A NUMBER
import java.util.Scanner;
public class AD_TASK5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    int i;
    int table;
    for(i=1;i<=10;i++)
    {
        table=a*i;
        System.out.println(a+"*"+i+"="+table);
        //System.out.printf("%d * %d = %d",a,i,table);
        //System.out.println();
    }
    
}
}
