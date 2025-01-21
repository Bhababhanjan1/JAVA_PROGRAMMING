package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Find the numbers having even number of digits in an Array using Linear Search (OPTIMISED)
public class AA00_Linear6ab {
    public static void main(String[] args) {
        int arr[]={12,3,0,34,78906,271500,95,713747324,676487,875,9145};
        System.out.println(countDigits(arr));
    }
    static int countDigits(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
        if(even(arr[i]))
        {
            count++;
        }
    }
    return count;
}     
    //Function to check wheather a number contains even no. of digits or not
    static boolean even(int num)
    {
        int numberofdigits=digits(num);
        if(numberofdigits % 2==0)
        {
            return true;
        }
        return false;

    }
    static int digits(int num)
    {
        if(num<0)
        {
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }
        return (int)(Math.log10(num)+1);
    }
    
}
