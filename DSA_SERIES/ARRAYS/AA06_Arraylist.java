package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
//Printin an arraylist by taking input from the user
import java.util.Scanner;
import java.util.ArrayList;
public class AA06_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial value size of the Integer ArrayList :");
        int b=sc.nextInt();
        System.out.println("Enter the initial size of String ArrayList: ");
        
        int c=sc.nextInt();
        //Inter ArrayList
        ArrayList <Integer> a=new ArrayList<>(b);
        //String ArrayList
        ArrayList <String> s=new ArrayList<>(c);
        //Adding elements into the Integer ArrayList by taking input from the user !
        
        for(int i=0;i<=5;i++){
            System.out.println("Enter the element of the Integer ArrayListat index "+i+" :");
            a.add(sc.nextInt());
        }
        
       System.out.println("The  Integer ArrayList is :");
       System.out.println(a);
       for(int i=0;i<=5;i++)
       {
        System.out.println(a.get(i)); //pass index here.List index syntax will no work here
       }
       //Adding elements into the String ArrayList by taking input from the user !
       for(int i=0;i<=5;i++)
       {
        System.out.println("Enter the elements of String ArrayList at index "+i+" :");
        s.add(sc.next());
       }
      System.out.println("The String ArrayList is :");
      System.out.println(s);
    }
    
}
