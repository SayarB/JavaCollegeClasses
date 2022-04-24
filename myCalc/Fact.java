package myCalc;

import java.util.Scanner;

public class Fact {
    int a;
    int result;
    
    public void operate()
    {
        this.result = fact(a);
    }
    public int fact(int a)
    {
        if(a==0)
            return 1;
        return a*fact(a-1);
    }
    public void getInput()
    {
        System.out.print("Enter a number : ");
        this.a = new Scanner(System.in).nextInt();
    }
}
