package Lab15;

public class Circle implements Area{

    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double computeArea()
    {
        return PI*radius*radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.computeArea();
        System.out.println("Area = "+area);
    }
}
