package JAVA_PROGRAMMING.TASK_JAVA;
//FLOYD'S TRIANGLE
public class AE04_TASK13 {
    public static void main(String[] args) {
        int number=1; 
        //OUTER  LOOP FOR ROWS

        for(int i=1;i<=5;i++)
        {
            //INNER  LOOP FOR COLUMNS

            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++; //number=number+1;
            }
            System.out.println();
        }
       
    }
}
