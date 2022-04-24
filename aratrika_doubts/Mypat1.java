package aratrika_doubts;

import java.util.Scanner;

public class Mypat1 {
    void mypat1()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the value of n");
            n=sc.nextInt();
        }while(n<=0);
        int c1,c2,r1,r2;
        c1=1;
        c2=0;
        r1=n;
        r2=0;
        for(int i=1;i<=n;i++)
        {
            int c=c1;            
            for(int j=1;j<=r1;j++)
            {
                System.out.print(c+" ");
                c+=2;
            }
            c=c2;
            for(int j=1;j<=r2;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
            c1+=2;
            c2++;
            r1--;
            r2++;

        }
    }   
    public static void main(String[] args) {
        new Mypat1().mypat1();
    }
}
