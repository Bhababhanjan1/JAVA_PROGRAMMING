package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - X
public class AE08_TASK21 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=5;i++)
       {
        for(j=1;j<=i;j++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        for(j=1;j<=5-i;j++)
        {
          System.out.print("  ");
        }
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        System.out.println();
       }
       for(i=1;i<=5;i++)
       {
        for(j=1;j<=5-i;j++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        for(j=1;j<=i;j++)
        {
          System.out.print("  ");
        }
        for(j=1;j<=5;j++)
        {
          System.out.print("*");
        }
        System.out.println();
       }
      
       
    
    }
    }

