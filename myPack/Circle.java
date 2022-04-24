package myPack;

public class Circle {
    int r;
    public Circle(int r)
    {
        this.r=r;
    }
    public double computeArea()
    {
        return Math.PI*r*r;
    }

}
