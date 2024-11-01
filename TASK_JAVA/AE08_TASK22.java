package JAVA_PROGRAMMING.TASK_JAVA;
// HOLLOW BUTTERFLY
/*


*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *


 */
public class AE08_TASK22 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(j=1;j<=2*(5-i);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
           
            System.out.println();
        }
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(j=1;j<=2*(5-i);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
           
            System.out.println();
        }
    }
}
