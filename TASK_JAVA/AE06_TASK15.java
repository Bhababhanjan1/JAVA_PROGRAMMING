package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - BUTTERFLY
public class AE06_TASK15 {
    public static void main(String[] args) {
        int i;
        int j;
        //UPPER HALF       
        for(i=1;i<=4;i++)
        {
            //1ST PART
            //PRINTING STAR
            for(j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            //PRINTING SPACES
            for(j=1;j<=2*(4-i);j++)
            {
                System.out.print(" ");
            }
            //2ND PART
            //PRINTING STAR 
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.err.println();
        }
        //LOWER HALF
        for(i=4;i>=1;i--)
        {
            //1ST  PART
            //PRINTING STAR

            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //PRINTING SPACES
            for(j=1;j<=2*(4-i);j++)
            {
                System.out.print(" ");
            }
            //2ND PART
            //PRINTING STAR
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
