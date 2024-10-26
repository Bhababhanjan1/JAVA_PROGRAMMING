package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - RHOMBUS
public class AE06_TASK16 {
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
