package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN-INVERTED HALF PYRAMID (ROTATED 180')
public class AD1_TASK10 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}