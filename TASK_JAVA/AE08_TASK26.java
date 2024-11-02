package JAVA_PROGRAMMING.TASK_JAVA;
//FIBONACCI SERIES
// 0, 1, 1, 2 , 3, 5, 8, 13, 21, 34, ...........
public class AE08_TASK26 {
    public static void fibonacci(int range)
    {
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2);
        int n3;       
        int i;
        for(i=1;i<=range;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Range:");
        fibonacci(10);
    }
}
