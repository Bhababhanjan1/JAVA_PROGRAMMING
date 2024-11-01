package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - X
/*

*****         *****
 *****       *****
   *****    *****
    *****  *****
     **********
    *****  *****
   *****    *****
  *****      *****
 *****        *****
*****          *****


 */
public class AE08_TASK21 {
    public static void main(String[] args) {
        int i;
        int j;
        //UPPER PART
        for(i=1;i<=5;i++)
       {
        //SPACES
        for(j=1;j<=i;j++)
        {
          System.out.print(" ");
        }
        //STARS
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        //SPACES
        for(j=1;j<=5-i;j++)
        {
          System.out.print("  ");
        }
        //STARS
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        System.out.println();
       }
       //LOWER PART
       for(i=1;i<=5;i++)
       {
        //SPACES
        for(j=1;j<=5-i;j++)
        {
          System.out.print(" ");
        }
        //STARS
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        //SPACES
        for(j=1;j<=i;j++)
        {
          System.out.print("  ");
        }
        //STARS
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        System.out.println();
       }
      
       
    
    }
    }

