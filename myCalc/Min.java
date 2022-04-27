package myCalc;

import java.util.Scanner;

public class Min {
    int arr[];
    int result;
    public void operate() {
        this.result = min();
    }
    public int min()
    {
        int min = arr[0];
        for(int a: arr)
        {
            min = Math.min(min, a);
        }
        return min;
    }
    public void getInput()
    {
        System.out.println("Enter value of n");
        int n = new Scanner(System.in).nextInt();
        this.arr = new int[n];
        for (int i=0; i<n;i++)
        {
            this.arr[i]=new Scanner(System.in).nextInt();
        }    
        result = min(); 
    }
    public void displayResult()
    {
        System.out.println("Result : "+this.result);
    }
}
