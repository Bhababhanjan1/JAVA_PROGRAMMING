package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - HOLLOW RHOMBUS
public class AE07_TASK17 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=0;i<=4;i++)
        {
            for(j=0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=4;j++)
            {
                if(i==0||j==0||i==4||j==4)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }

