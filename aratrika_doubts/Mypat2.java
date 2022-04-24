package aratrika_doubts;
import java.util.Scanner;
public class Mypat2 {
    void mypat2()
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Enter the value of n");
            n=sc.nextInt();
        }while(n<=0);
        
        int c = 1;
        int r1=n-1;
        int r2=1;
        int diff=0;
        for(int i=1;i<=n;i++)
        {
            c=i;
            for(int j=1;j<=r1;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=r2;j++)
            {
                System.out.print(c+"  ");
                c+=i;
            }
            System.out.println();
            r1--;
            r2++;
        }
        r1=1;
        for(int i=n-1;i>=1;i--)
        {
            c=i;
            r2=i;
            for(int j=1;j<=r1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=r2;j++)
            {
                System.out.print(c+"  ");
                c+=i;
            }
            r1++;
            System.out.println();
        }
                        
    }
    public static void main(String[] args) {
        new Mypat2().mypat2();
    }
}
