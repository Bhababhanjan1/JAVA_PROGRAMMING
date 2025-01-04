package JAVA_PROGRAMMING.CORE_JAVA;
//Variable arguments of different data types
import java.util.Arrays;



public class BA02_Varargs1 {
    public static void main(String[] args) {
        arr(2,4,'a','b');

    }
    static int arr(int a,int b,char... v)
    {
        System.out.println(a+" "+b);
        System.out.println(Arrays.toString(v));
        return a;
    }
}
