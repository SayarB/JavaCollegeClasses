package Assessment1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int numUnit=0;
        do{
            System.out.print("Enter number of Units consumed : ");
            numUnit = new Scanner(System.in).nextInt();
        }while(numUnit<0);
        double price = 0.0;
        if(numUnit<=100)
        {
            price = 200.0;            
        }else if(numUnit<=150)
        {
            price = 200.0+(numUnit-100)*0.6;            
        }
        else if(numUnit<=200)
        {
            price = 230+(numUnit-150)*1.2;
        }
        else
        {
            price = 290+(numUnit-200)*2.4;            
        }

        System.out.println("Electricity Bill Amount = "+price);
    }
}
