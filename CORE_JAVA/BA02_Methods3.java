package JAVA_PROGRAMMING.CORE_JAVA;
//METHOD OVERLOADING
public class BA02_Methods3 {
    public static void main(String[] args) {
        sum(101);
        sum("Bhaba");
        
    }
    static void sum(String name) {
    System.out.println(name);
}
static void sum(int a)
{
    System.out.println(a);
}
}
