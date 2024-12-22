package JAVA_PROGRAMMING.CORE_JAVA;
//Example-Typecasting
public class A4_Typecasting4 {
    public static void main(String[] args) {
        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);// Result will be in double
    }
}
