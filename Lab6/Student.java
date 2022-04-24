package Lab6;
import java.util.Scanner;

public class Student
{
    
    String regnum;
    String name;
    int[] marks;
    double cgpa;
    public Student()
    {
        regnum="";
        name="";
        marks=new int[5];
        cgpa=0.0;
    }
    void getInput()
    {
        System.out.print("Enter Name : ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Enter Register Number : ");
        regnum = new Scanner(System.in).nextLine();        
        for (int i=0;i<5;i++)
        {
            System.out.print("Enter marks for Subject "+(i+1)+" : ");
            marks[i]=new Scanner(System.in).nextInt();
        }

    }
    void calculateCgpa()
    {
        int total = 0;
        for(int i=0;i<5;i++)
        {
            total+=marks[i];
        }
        float avg = total/5;
        cgpa = avg/10;
    }
    void print()
    {
        System.out.println("Name : "+name+"  CGPA : "+cgpa);
    }
    public static void main(String[] args) {
        Student stud1 = new Student();
        System.out.println("Student 1");
        stud1.getInput();
        stud1.calculateCgpa();
        Student stud2 = new Student();
        System.out.println("Student 2");
        stud2.getInput();
        stud2.calculateCgpa();

        System.out.print("Student 1 => ");
        stud1.print();
        System.out.print("Student 2 => ");
        stud2.print();

    }
}
