package Lab5;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        int n=new Scanner(System.in).nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=new Scanner(System.in).nextInt();
        }
        int highest = 0;
        int secondHighest = 0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>highest)
            {
                secondHighest=highest;
                highest=arr[i];
            }
            else if(arr[i]>secondHighest)
            {
                secondHighest=arr[i];
            }
        }
        System.out.println("Maximum product = "+highest+" X "+secondHighest+" = "+(highest*secondHighest));
    }
}
