package myCalc;

import java.util.Scanner;

public class Add {
    int a;
    int b;
    int result;
    
    public void operate()
    {
        this.result = this.a+this.b;
    }
    public void getInput()
    {
        System.out.print("a = ");
        this.a = new Scanner(System.in).nextInt();        
        System.out.print("b = ");
        this.b = new Scanner(System.in).nextInt();
        operate();
    }
    public void displayResult()
    {
        System.out.println("Result : "+this.result);
    }

}
