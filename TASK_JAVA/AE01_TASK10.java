package JAVA_PROGRAMMING.TASK_JAVA;
// PATTERN- INVERTED HALF PYRAMID (ROTATED 180')
public class AE01_TASK10 {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--) //for(i=1;i<=4;i++)
        {
            for(int j=1;j<i;j++) //for(j=1;j<=n-1;j++) //for(j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=4-i;j++)//for(j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    
}
}
