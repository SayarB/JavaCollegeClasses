package myCalc;

public class Mul {
    int a;
    int b;
    int result;
    
    public void operate()
    {
        this.result = this.a*this.b;
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
