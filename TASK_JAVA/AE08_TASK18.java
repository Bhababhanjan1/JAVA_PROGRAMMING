package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN- NUMBER PYRAMID
public class AE08_TASK18 {
    public static void main(String[] args) {
        int number=1;
        for(int i=1;i<=5;i++)
        {
            //First For Loop For Printing Spaces
            for(int j=0;j<=4-i;j++)
            {
            System.out.print(" ");
            }
            //Second For Loop for Printing Number

            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            

            System.out.println();
        }
        
    }
}
