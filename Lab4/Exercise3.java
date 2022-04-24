package Lab4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int low=new Scanner(System.in).nextInt();
        int high=new Scanner(System.in).nextInt();
        System.out.println("Prime Numbers =>");
        for (int i=low;i<=high;i++)
        {
            boolean isPrime=true;
            
            for (int j = 2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)                
                    isPrime=false;
                
            }
            if(isPrime)
            {
                System.out.print(i+", ");
            }
        }

    }
}
