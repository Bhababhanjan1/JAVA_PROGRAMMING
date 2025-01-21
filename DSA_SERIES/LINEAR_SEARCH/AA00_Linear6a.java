package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Find the numbers having even number of digits in an Array using Linear Search --LEETCODE
public class AA00_Linear6a {
    public static void main(String[] args) {
        int arr[]={1,2,3,22,4567,111,2719,537,7353};
        System.out.println(count(arr));
    }
    static int count(int arr[])
    {
        int countFinal=0;
        
        for(int i=0;i<arr.length;i++){
            int count=0;
        while(arr[i]>0)
        {
            if(arr[i]<0)
            {
                arr[i]=arr[i]*-1;
            }
            if(arr[i]==0)
            {
                return 1;
            }
            count++;
            arr[i]=arr[i]/10;
        }
        if(count%2==0)
        {
            countFinal++;
        }
    }
        return countFinal;
        
    }
    
}
