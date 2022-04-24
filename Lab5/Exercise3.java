package Lab5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        int n=new Scanner(System.in).nextInt();
        System.out.println("Enter Elements :");
        int arr[]=new int[n];
        int odds[]=new int[n];
        int evens[]=new int[n];
        int numOdd = 0;
        int numEven=0;
        for (int i=0;i<n;i++)
        {
            arr[i]=new Scanner(System.in).nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            {
                odds[numOdd++]=arr[i];
            }else
            {
                evens[numEven++]=arr[i];
            }
        }
        System.out.println("Odd numbers =>");
        for (int i=0;i<numOdd;i++)
        {
            System.out.print(odds[i]+", ");
        }
        System.out.println("Size = "+numOdd);
        System.out.println("Even numbers =>");
        for (int i=0;i<numEven;i++)
        {
            System.out.print(evens[i]+", ");
        }
        System.out.println("Size = "+numEven);


    }
}
