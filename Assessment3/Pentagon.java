import java.util.Scanner;

public class Pentagon {
    double side;
    Pentagon(double side)
    {
        this.side = side;
    }
    double findArea()
    {
        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5))) * side*side;
    }
    public static void main(String[] args) {

        System.out.print("Input the side : ");
        double sides = new Scanner(System.in).nextDouble();
        Pentagon pent = new Pentagon(sides);

        System.out.println("The area of pentagon : "+pent.findArea());
    }
}
