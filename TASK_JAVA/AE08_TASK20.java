package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - DIAMOND
public class AE08_TASK20 {
    public static void main(String[] args) {
        int i;
        int j;
        //UPPER  HALF
        for(i=1;i<=4;i++)
        {
            //PRINTING SPACES
            for(j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            //PRINTING  *
            for(j=1;j<2*i;j++) // for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            

            System.out.println();
        }

        //LOWER HALF
        for(i=1;i<4;i++) //for(i=4;i>=1;i--)
        {
            //PRINTING SPACES
            for(j=1;j<=i;j++) //for(j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            //PRINTING *

            for(j=1;j<2*(4-i);j++) //for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
