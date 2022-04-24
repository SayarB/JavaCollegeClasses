import java.util.Scanner;

import myPack.*;

public class AreaOfShape {
    public static void main(String[] args)
    {        
        System.out.println("Radius of Circle : ");
        int r = new Scanner(System.in).nextInt();
        System.out.println("Side Length of Square : ");
        int side = new Scanner(System.in).nextInt();
        System.out.println("Length and Breadth of Rectangle : ");
        int l = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        Circle c = new Circle(r);
        Square s = new Square(side);
        Rectangle rect = new Rectangle(l,b);

        System.out.println("Area of :\nCircle : "+c.computeArea()+"\nSquare : "+s.computeArea()+"\nRectangle : "+rect.computeArea());
    }
}
