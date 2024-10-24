package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN-2

public class AD_TASK7 {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0||j==0||i==3||j==4)
                {
                    System.out.print("x");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}