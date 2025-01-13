package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS.QUESTIONS_ARRAY;
//Reversing an array
import java.util.Arrays;


public class AA00_Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void reverse(int a[]){
        int start=0;
        int end=a.length-1;
        int i;
        for(i=0;i<a.length/2;i++)
        {
          int temp=a[start];
          a[start]=a[end];
          a[end]=temp;
          start++;
          end--;
        }
       
    }
}

