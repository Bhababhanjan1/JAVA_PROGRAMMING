package JAVA_PROGRAMMING.TASK_JAVA;

import java.util.Scanner;

public class AE08_TASK41 {
     public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows:");
        int a=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];// ARRAY DECLARATION
        System.out.println("Enter the elements of the array:");
        //INPUT
        //ROWS
        for(int i=0;i<a;i++)
        {
            //COLUMNS
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is:");
        //OUTPUT
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            int searching_number;
            System.out.println("Enter the number you want to search:");
            searching_number=sc.nextInt();
            //SEARCHING NUMBER
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    if(arr[i][j]==searching_number)
                    {
                        System.out.println("The number is found at: ["+i+"] ["+j+"]");
                    }
                    else{
                        System.out.println("The number is not found");
                    }
                    
                }
            }
            
        }
    }

