import java.util.*;
abstract class dept
{
    double bp;
    dept(double bpay)
    {   
        bp=bpay;
    }
    void disp()
    {
        System.out.println("basicpay="+bp);
    }
    abstract double bonus();
}
class sales extends dept
{
    sales(double bpay)
    {
        super(bpay);
    }
    public double bonus()
    {
        return(0.20*bp);
    }
}
class marketing extends dept
{
    marketing(double bpay)
    {
        super(bpay);
    }
    public double bonus()
    {
        return(0.30*bp);
    }
}
class hr extends dept
{
    hr(double bpay)
    {
        super(bpay);
    }
    public double bonus()
    {
        return(0.50*bp);
    }
}
