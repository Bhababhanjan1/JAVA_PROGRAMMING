package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
//Printing Array of Arrays by using ArrayList
import java.util.Scanner;
import java.util.ArrayList;

public class AA07_Arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        System.out.println("Enter the number of arrays:");
        int a=sc.nextInt();
        
        //Initialisation
        for(i=0;i<=a;i++)
        {
            list.add(new ArrayList<>());
        }
        //Add elemenets
        for(i=0;i<=3;i++)
        {
            for(j=0;j<=3;j++)
            {
                System.out.println("Enter the element of array "+i+" at position "+j+" :");
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
    
    
}
