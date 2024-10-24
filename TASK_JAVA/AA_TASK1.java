package JAVA_PROGRAMMING.TASK_JAVA;
//Checking a number is divisible by 2 or not (USING FOR LOOP)
public class AA_TASK1 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" IS DIVISIBLE BY 2");
            }
            else{
                System.out.println(i+" IS NOT DIVISIBLE BY 2!");
            }
        }
    }
}
