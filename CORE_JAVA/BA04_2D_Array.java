package JAVA_PROGRAMMING.CORE_JAVA;
//2D-ARRAY 
import java.util.Scanner;
public class BA04_2D_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ARRAY DECLARATION
        System.out.println("Enter the number of rows:");
        int a=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int b=sc.nextInt();
        int numbers[][]=new int[a][b]; // DATA_TYPE ARRAY_NAME [][]=NEW DATATYPE[ROWS][COLUMNS];
        // ROWS
        for(int i=0;i<a;i++)
        {
            // COLUMNS
            for(int j=0;j<b;j++)
            {
                //System.out.println("Enter the  element at position ["+i+"]["+j+"]:");
                System.out.printf("Enter the [%d][%d]th element:",i,j);
                System.out.println();
                //TAKING INPUT FROM USER!!
                 numbers[i][j]=sc.nextInt();
            }
        } 
        System.out.print("The Array is: [");
        //FOR DISPLAYING THE OUTPUT!!
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                
                System.out.print(numbers[i][j]+" " ); 
            }
        }
        System.out.print("]");
        
    }
}
