package Lab7.Accounts;

public class SavAcct extends Accounts{
    public SavAcct(String name,double initial_bal)
    {
        super(name,initial_bal,12,0,0);
    }
    void display()
    {
        System.out.println("\nName : "+super.name+"\nType of Account : Savings\nTotal Balance = "+super.balance);
    }
}
