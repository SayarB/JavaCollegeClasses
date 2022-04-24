package Lab15.InterfaceExample;

public class Mover implements Interface, Interface2 {
    int posX=0;
    int posY=0;    
    public void move() {
        posX = Interface.xspeed;
        posY = Interface2.yspeed;
        System.out.println(String.format("position \nx: %d\ny: %d",posX,posY));
    }    
    public static void main(String[] args) {
        Mover mover = new Mover();
        mover.move();
    }
    
}

