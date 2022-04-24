package Lab7.Accounts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter 1 for savings and 2 for current => ");
        int choice = new Scanner(System.in).nextInt();
        
        System.out.print("Enter balance : ");
        double balance = new Scanner(System.in).nextDouble();
        if(choice ==1)
        {
            SavAcct acc = new SavAcct(name, balance);
            acc.display();
            acc.deposit(2000);
            acc.withdraw(1000);
            acc.withdraw(3000);
            acc.deposit(200);
            acc.withdraw(50);
            acc.deposit(2000);
        }
        else
        {
            CurAcct acc = new CurAcct(name, balance);
            acc.display();
            acc.deposit(2000);
            acc.withdraw(1000);
            acc.withdraw(3000);
            acc.deposit(200);
            acc.withdraw(50);
            acc.deposit(2000);
        }
        
    }
}
