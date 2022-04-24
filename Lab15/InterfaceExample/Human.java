package Lab15.InterfaceExample;

public class Human extends Mover {
    double calculateDistance()
    {
        return Math.sqrt(super.posX*super.posX + super.posY*super.posY);
    }

    
    public void move() {    
        super.move();
        double distance = calculateDistance();
        System.out.println("Distance : "+distance);
    }
    public static void main(String[] args) {
        Human man = new Human();
        man.move();
    }
}
