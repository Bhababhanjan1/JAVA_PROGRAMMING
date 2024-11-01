package JAVA_PROGRAMMING.TASK_JAVA;
//PATTERN - 01 TRIANGLE
/* 


1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1


 */
public class AE05_TASK14 {
    public static void main(String[] args) {
        int number =1;
        //OUTER  LOOP FOR ROWS

        for(int i=1;i<=5;i++)
        {
            //INNER  LOOP FOR COLUMNS

            for(int j=1;j<=i;j++)
            {
               if((i+j)%2==0)
               {
                System.out.print(" 1");
               }
               else{
                System.out.print(" 0");
               }
                
            }
            System.out.println();
        }
    }
}
