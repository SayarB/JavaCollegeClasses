package Lab6;

import java.util.Scanner;

public class Account {
    String name;
    double balance;
    String type;
    double interest;
    double penalty;
    double min_balance;
    double pending_penalty;
    public Account(String name,double initial_bal,String type,double interest,double penalty,double min_bal)
    {
    
        this.name=name;
        this.balance = initial_bal;
        this.type=type;
        if(type.equals("savings"))
            this.interest=interest;
        else
            this.interest=0;
        this.penalty=penalty;
        this.min_balance = min_bal;
        this.pending_penalty=0;
    }
    void deposit(double money)
    {
        balance+=money;
        
        System.out.println("\nMoney Deposited = "+money+"\nBalance = "+balance);
        if(pending_penalty==0)return;

        System.out.println("Do you want to pay the penalty right now (y/n) => ");
        char ch = new Scanner(System.in).next().charAt(0);
        if(ch=='y')cutPenalty();
                 
        
    }    
    void withdraw(double money)
    {
        if(pending_penalty!=0)
        {
            System.out.println("Deposit money as you have pending penalty of "+pending_penalty);
            return;
        }
        if(balance>money)  
        {    
            
            balance-=money;
            System.out.println("\nMoney withdrawn = "+money+"\nBalance = "+balance);  
            if(balance<min_balance )            
            {
                System.out.println("\nBalance less than minimum balance ("+min_balance+")");
                addPenalty();
                
                
            }
        
        }
        else
            System.out.println("\nInsufficient Balance");
        
    }
    void addPenalty()
    {
        pending_penalty+=penalty;
        System.out.println("Penalty Pending = "+pending_penalty+"\nBalance = "+balance);
        if(balance>pending_penalty)
        {
            System.out.println("Do you want to pay the penalty right now (y/n) => ");
            char ch = new Scanner(System.in).next().charAt(0);
            if(ch=='y')cutPenalty();
        }

    }
    void cutPenalty()
    {
        if(pending_penalty==0)return;

        if(balance>pending_penalty)
        {
            balance-=pending_penalty;
            pending_penalty = 0;
            System.out.println("Penalty Deducted = "+penalty+"\nBalance = "+balance);            
        }else
        {
            System.out.println("Insufficient Balance.");
        }
    }
    void addInterest()
    {
        balance+=balance*(interest/100);
        System.out.println("\nInterest Added \nBalance = "+balance);
    }
    void display()
    {
        System.out.println("\nName : "+name+"\nType of Account : "+type+"\nTotal Balance = "+balance);
    }
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter 1 for savings and 2 for current");
        int choice = new Scanner(System.in).nextInt();
        String type = choice==1?"savings":"current";
        System.out.print("Enter balance : ");
        double balance = new Scanner(System.in).nextDouble();
        Account acc = new Account(name, balance, type, 12, 500, 2000);

        acc.display();
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.withdraw(3000);
        acc.deposit(200);
        acc.withdraw(50);
        acc.deposit(2000);
    }
}
