package aratrika_doubts;
import java.util.Scanner;
public class Pat3 {
    void pat3()
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
            for(int j=1;j<=n-i;j++)
             System.out.print(" ");
            for(int j=1;j<=i;j++)
             System.out.print((i*j)+" ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
             System.out.print(" ");
            for(int j=1;j<=i;j++)
             System.out.print((i*j)+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Pat3().pat3();
    }
}
