package JAVA_PROGRAMMING.CORE_JAVA;

import java.util.Arrays;

//Pass by value of reference variable (For Non-primitive data types like Arrays, Objects etc)
public class BA02_Methods2 {
    static int A(int a[]) //Here a[] is taking the value of the reference variable and thus pointing to the same address space so the changes made to the a[] also effect the original array i.e b[] .
    {
        a[0]=90;
        return a[0];
    }
}
class Main{
    public static void main(String[] args) {
        int b[]={1,2,3,4,5,6};
        System.out.println("Before calling the method the array is: "+Arrays.toString(b));
        BA02_Methods2.A(b);
        System.out.println("After calling the method the array is "+Arrays.toString(b));
        
    }
}