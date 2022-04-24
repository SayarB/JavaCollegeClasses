package Database;

public class Officer extends Staff{
    private int grade;
    public Officer(int code, String name, int grade)
    {
        super(code,name);
        this.grade = grade;
    }
    public int getGrade()
    {
        return grade;
    }
   
    public String toString() {
        
        return super.toString()+String.format("Grade : %d\n",this.grade);
    }
}
