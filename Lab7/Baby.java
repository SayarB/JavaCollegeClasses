package Lab7;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Baby {
    SimpleDateFormat sdf;
    String name;
    Date dob;
    Date bcgDate;
    Date polioDate;
    public Baby(String name,String dob)
    {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.name = name;
        try{
            this.dob = sdf.parse(dob);
        }catch(Exception e)
        {

        }
    }
    public void calculateDates()
    {
        
        Calendar c = Calendar.getInstance();
        c.setTime(dob);
        c.add(Calendar.DATE,60);
        bcgDate = c.getTime();
        c.setTime(dob);
        c.add(Calendar.DATE,45);
        polioDate=c.getTime();
    }
    void display()
    {
        System.out.println("Name : "+this.name+"\nDate of Birth : "+sdf.format(dob)+"\nDate of BCG : "+sdf.format(bcgDate)+"\nDate of Polio : "+sdf.format(polioDate));
    }
    public static void main(String []args)
    {
        System.out.print("Enter Name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter Date of Birth in DD/MM/YYYY format : ");
        String dob =new Scanner(System.in).nextLine();
        Baby baby = new Baby(name, dob);
        baby.calculateDates();
        baby.display();
    }

}
