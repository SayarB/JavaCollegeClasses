package aratrika_doubts;

import java.util.Scanner;

public class Pat2 {
    void pat2()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter the value of n");
            n=sc.nextInt();
        }while(n<=0);
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
             System.out.print((2*j-1)+" "); //logic for printing pattern 1 
            for(int j=1;j<i;j++)
             System.out.print((i-1)+" "); //logic for printing pattern 2
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Pat2().pat2();

    }
}
