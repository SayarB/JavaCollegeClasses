package ashish;

import java.util.Scanner;

public class Sorting {

    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                    minIndex=j;
                
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter length of array => ");
        int n=new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = new Scanner(System.in).nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted Array =>");
        for(int ele:arr)
        {
            System.out.print(ele+", ");
        }
    }
}
