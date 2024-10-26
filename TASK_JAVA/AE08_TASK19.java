package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN- PALINDROMIC PYRAMID
public class AE08_TASK19 {
    public static void main(String[] args) {
        int i;
        int j;
        {
            for(i=1;i<=5;i++)
            {
                //PRINTING SPACES
                for(j=1;j<=5-i;j++)
                {
                System.out.print(" ");
                }
                //PRINTING FIRST HALF NUMBERS OF THE PYRAMID (BACKWARD LOOP)
              for(j=i;j>=1;j--)
              {
                System.out.print(j);
                
              }
              //PRINTING SECOND HALF NUMBERS OF THE PYRAMID (FORWARD LOOP)
              for(j=2;j<=i;j++)
              {
                System.out.print(j);
              }
              System.out.println();
            }
           
        }
    }
}
