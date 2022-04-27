package myCalc;

import java.util.Scanner;

public class Max {
    int arr[];
    int result;
    public void operate() {
        this.result = max();
    }
    public int max()
    {
        int max = arr[0];
        for(int a: arr)
        {
            max = Math.max(max, a);
        }
        return max;
    }
    public void getInput()
    {
        System.out.println("Enter number of numbers");
        int n=new Scanner(System.in).nextInt();
        this.arr = new int[n];
        System.out.println("Enter numbers");
        for(int i=0;i<n;i++)
        {
            this.arr[i]= new Scanner(System.in).nextInt();
        }
        result = max();
    }
    public void displayResult()
    {
        System.out.println("Result : "+this.result);
    }

}
