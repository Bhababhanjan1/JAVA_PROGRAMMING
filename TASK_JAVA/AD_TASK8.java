package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN-HALF PYRAMID
public class AD_TASK8 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
