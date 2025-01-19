package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Find the numbers having even number of digits in an Array using Linear Search (OPTIMISED)
public class AA00Linear6a {
    public static void main(String[] args) {
        int arr[]={12,3,0,34,78906,271500,95,713747324,676487,875,9145};
        System.out.println(countdigits(-8765));
    }
    static int countdigits(int num)
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
