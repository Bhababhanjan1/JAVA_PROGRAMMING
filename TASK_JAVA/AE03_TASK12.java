package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN- INVERTED HALF PYRAMID WITH NUMBERS
public class AE03_TASK12 {
    public static void main(String[] args) {
        //OUTER LOOP
        for(int i=5;i>=1;i--) //for(int i=1;i<=5;i++)
        {
            //INNER LOOP
            for(int j=1;j<=i;j++) //for(int j=1;j<=5-i+1)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}