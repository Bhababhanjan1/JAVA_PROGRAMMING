package JAVA_PROGRAMMING.DSA_SERIES.LINEAR_SEARCH;
//Searching a particular character in a string using Linear Search
import java.util.Scanner;
public class AA00_Linear2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String st=sc.nextLine();
        System.out.println("Enter a searching element:");
        //Taking input a character
        char target=sc.next().charAt(0);
        search(st,target);
        if(search(st, target)!=true)
        {
            System.out.println("Element not found!!");
        }
        else{
            System.out.println("Element is found!!");
        }
        search2(st, target);
        System.out.println(search2(st, target));
        
        
    }
    static boolean search(String st,char target)
    {
        if(st.length()==0)
        {
            return false;
        }
        for(int i=0;i<st.length();i++)
        {
            if(target==st.charAt(i))
            {
                
                return true;
                
            }
        }
        return false;
    }
    static boolean search2(String st,char target)
    {
        if(st.length()==0)
        {
            return false;
        }
        for(char ch:st.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }
    
    
}
