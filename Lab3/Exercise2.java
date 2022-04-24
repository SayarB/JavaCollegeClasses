package Lab3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Enter a number");
            n=sc.nextInt();
            if(n<=99 || n>999)
            {
                System.out.println("Number should be three digit");
            }
        }while(n<=99 || n>999);
        int num = n;
        int sum = 0;
        while(num>0)
        {
            int dig = num%10;
            sum+=dig;
            num/=10;
        }
        System.out.println("Sum of digits of "+n+" = "+sum);
    }
}
