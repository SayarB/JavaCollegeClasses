package Database;

public class Typist extends Staff {
    private double speed;
    public Typist(int code, String name, double speed)
    {
        super(code, name);
        this.speed = speed;
    }
    public double getSpeed()
    {
        return speed;
    }
    public String toString() {
       return super.toString()+String.format("Speed : %.2fWPM\n", speed);
    }
}
