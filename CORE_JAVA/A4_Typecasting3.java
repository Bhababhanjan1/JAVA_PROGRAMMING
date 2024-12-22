package JAVA_PROGRAMMING.CORE_JAVA;
//Automatic type promotion and conversion
public class A4_Typecasting3 {
    public static void main(String[] args) {
        byte b=56;
        int a=3*b;
        float f=a*b;
        System.out.println(f); //Automatically converted into float.
    }
}
