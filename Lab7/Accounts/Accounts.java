package Lab7.Accounts;

import java.util.Scanner;

public class Accounts {
    String name;
    double balance;
    double penalty;
    double min_balance;
    double pending_penalty;
    double interest;

    public Accounts(String name,double initial_bal,double interest,double penalty,double min_bal)
    {
    
        this.name=name;
        this.balance = initial_bal;        
        this.interest = interest;
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
    

}
