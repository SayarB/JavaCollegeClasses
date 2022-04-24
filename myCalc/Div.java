package myCalc;

public class Div {
    int a;
    int b;
    double result;
    
    public void operate()
    {
        this.result = this.a*1.0/this.b;
    }
    public getInput()
    {
        System.out.print("a = ");
        this.a = new Scanner(System.in).nextInt();        
        System.out.print("b = ");
        this.b = new Scanner(System.in).nextInt();
        operate();
    }

}
