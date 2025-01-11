package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS.QUESTIONS_ARRAY;
//Maximun element of an array
public class AA00_Q2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("The Maximun value of the array is :");
        int B=max(a);
        System.out.println(B);
       

    }
    static int max(int a[])
    {
        int maxVal=a[0];
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>maxVal)
            {
                maxVal=a[i];
               
            }
        }
        return maxVal;
    }
}
