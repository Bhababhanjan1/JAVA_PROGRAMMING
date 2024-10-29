package JAVA_PROGRAMMING.CORE_JAVA;
//DEFINING THE SIZE AND ELEMENTS OF AN ARRAY BY TAKING INPUT FROM USER
import java.util.Scanner;
public class BA03_Array3 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int a=sc.nextInt();//Taking input from user
    int age[]=new int[a];
    for(int i=0;i<a;i++) //Taking the input elements
    {
        System.out.println("Enter the elements of the array:");
        age [i]=sc.nextInt();

    }
    for(int i=0;i<a;i++) //Printing the input elements
    {
        System.out.printf("The %dth element of the array is: %d",i,age[i]);
        System.out.println();
    }
    return;
}
}

