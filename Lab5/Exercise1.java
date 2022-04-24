package Lab5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int n= new Scanner(System.in).nextInt();
        int arr[]  = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            arr[i]=new Scanner(System.in).nextInt();
        }
        int dup[] = new int[n];
        int c=0;
        for (int i=0;i<n;i++)
        {
            boolean found = false;
            for (int j=0;j<c;j++)
            {
                if(dup[j]==arr[i])
                {
                    found=true;
                }
            }
            if(!found)
            {
                dup[c]=arr[i];
                c++;
            }
        }
        System.out.println("Array without duplicates =>");
        for(int i=0;i<c;i++)
        {
            System.out.print(dup[i]+", ");
        }

    }
}
