package Lab7.Accounts;

public class CurAcct extends Accounts{
    public CurAcct(String name,double initial_bal)
    {
        super(name,initial_bal,12,500,2000);
    }
    void display()
    {
        System.out.println("\nName : "+super.name+"\nType of Account : Current\nTotal Balance = "+super.balance);
    }
}
