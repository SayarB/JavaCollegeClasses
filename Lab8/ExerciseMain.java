package Lab8;

public class ExerciseMain extends Exercise {
    public void display()
    {
        System.out.println("In Parent Class:");
        super.display();
        System.out.println("In Sub Class");
        System.out.print("Public Variable = ");
        System.out.println(super.pub_var);               
        System.out.print("Protected Variable = ");        
        System.out.println(super.pro_var);               
        System.out.print("Default Variable = ");        
        System.out.println(super.def_var);        
        System.out.print("Static Variable = ");        
        System.out.println(Exercise.stat_var);                        
    }
    public void change()
    {
        super.pub_var=200;
        super.pro_var=300;
        super.def_var=400;
        Exercise.stat_var = 900;
        //final_var cannot be changed
    }
    public static void main(String []args)
    {
        ExerciseMain exm = new ExerciseMain();
        
        exm.display();
        System.out.println(exm.pub_var+" "+exm.def_var+" "+exm.pro_var+" "+Exercise.stat_var+" "+Exercise.final_var);
        exm.change();
        System.out.println("\nAfter Change\n");
        exm.display();
    }
}
