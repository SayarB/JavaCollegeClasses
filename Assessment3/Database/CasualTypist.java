package Database;

public class CasualTypist extends Typist{

    private double dailyWages;
    public CasualTypist(int code, String name, double speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }
    public double getDailyWages()
    {
        return dailyWages;
    }
    public String toString() {
       return super.toString()+String.format("Daily Wages : %.2f\n", this.dailyWages);
    }
}
