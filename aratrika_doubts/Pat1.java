package aratrika_doubts;

import java.util.Scanner;

public class Pat1 {
    void pat1()
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
            int c=i;
            int diff=n-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c+=diff;
                diff--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Pat1().pat1();
    }
}
