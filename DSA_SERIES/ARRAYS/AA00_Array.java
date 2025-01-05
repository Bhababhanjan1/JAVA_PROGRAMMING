package JAVA_PROGRAMMING.DSA_SERIES.ARRAYS;
import java.util.Arrays;
//Arrays declaration and printint an array
public class AA00_Array {
    public static void main(String[] args) {
        //declaration and initialization of  an array
        //TYPE-1
        int arr[]=new int [5];   // Syntax:   Data_type array_name[] = new data_type[size];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        //TYPE-2
        int arr1[]={1,2,3,4,};    //Note:- Inside an array all the data types must be similar .

        
        //printing an array
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    
}
