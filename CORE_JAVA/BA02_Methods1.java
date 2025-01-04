package JAVA_PROGRAMMING.CORE_JAVA;
//Pass by value
public class BA02_Methods1 {
    static void a(int x)
    {
        x=90; //Value of x is changed only inside the method and is performed in separate memory address not the original memory address
    }
}
class d{
    public static void main(String[] args) {
        int x=50;
        BA02_Methods1.a(x);
        System.out.println(x); //The original value is not changed due to pass by value which is applicable for the primitive data types
    }
}
