package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN- INVERTED HALF PYRAMID (ROTATED 180') (FLIPPED)
public class AE00_TASK10a {
    public static void main(String[] args) {
        
    
    for(int i=1;i<5;i++)
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
