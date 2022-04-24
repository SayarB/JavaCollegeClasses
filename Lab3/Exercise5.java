package Lab3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print(1);
            for (int j=0;j<2*i-1;j++)
            {
                System.out.print(0);
            }
            System.out.print(1);
            System.out.println();
        }
    }
}
