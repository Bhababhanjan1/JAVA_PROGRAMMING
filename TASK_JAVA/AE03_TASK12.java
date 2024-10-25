package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN- INVERTED HALF PYRAMID WITH NUMBERS
public class AE03_TASK12 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
