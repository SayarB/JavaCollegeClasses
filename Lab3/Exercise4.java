package Lab3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter number of lines");
        int n=new Scanner(System.in).nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
