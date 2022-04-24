package Lab15;

public class Rectangle implements Area {

    double a,b;
    Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public double computeArea() {
        return a*b;      
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3,5);
        double area = rect.computeArea();
        System.out.println("Area of Rectangle : "+area);
    }
    
}
