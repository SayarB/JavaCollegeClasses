import java.util.*;
class MethodOverload
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic pay");
        double bp=sc.nextDouble();
        sales s=new sales(bp);
        s.disp();
        System.out.println("bonus for sales dept=" +s.bonus());
        marketing m=new marketing(bp);
        m.disp();
        System.out.println("bonus for marketing dept=" +m.bonus());
        hr h=new hr(bp);
        h.disp();
        System.out.println("bonus for hr dept=" +h.bonus());
        sc.close();
    }
}