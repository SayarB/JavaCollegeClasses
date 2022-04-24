package Lab3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int num = 0;
        do{
            System.out.println("Enter a number");
            num=new Scanner(System.in).nextInt();

            if(num<=999 || num>9999)
            {
                System.out.println("Number is not four digits. Try again");
            }
        }while(num<=999 || num>9999);
        int copy = num;
        int c=1;
        while(num>0)
        {
            int digit = num%10;
            System.out.println("Digit "+(c++)+" = "+digit);
            num/=10;
        }

    }
}
