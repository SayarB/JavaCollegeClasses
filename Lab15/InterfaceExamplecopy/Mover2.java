package Lab15.InterfaceExamplecopy;

public class Mover2 implements Interface2 {
    int posX=0;
    int posY=0;    
    public void move() {
        posX = Interface.xspeed;
        posY = Interface2.yspeed;
        System.out.println(String.format("position \nx: %d\ny: %d",posX,posY));
    } 
    public static void main(String[] args) {
        Mover2 mover = new Mover2();
        mover.move();
    }
}
