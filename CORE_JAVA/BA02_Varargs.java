package JAVA_PROGRAMMING.CORE_JAVA;
//Variable Arguments
import java.util.Arrays;;
public class BA02_Varargs {
    public static void main(String[] args) {  
        sum(7,8,9,5,4);      
    }
    static int sum(int...a) {
        System.out.println(Arrays.toString(a)); //Arrays.toString() is used to convert array to string
       return Arrays.stream(a).sum();
        
}
}
