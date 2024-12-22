package JAVA_PROGRAMMING.CORE_JAVA;
//Explicit type casting
public class A4_Typecasting2 {
    public static void main(String[] args) {
        double d=78.67d;
        int i=(int)(d);
        short f=282;
        byte b=(byte)(d);
        System.out.println(i);   //Conversion of bigger data type into smaller data type
        System.out.println(b);
    }
}
