package Assessment1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        String subjects[] = {"Subject 1","Subject 2","Subject 3","Subject 4","Subject 5"};
        int marks[]=new int[subjects.length];
        for(int i=0;i<subjects.length;i++)
        {
            do{
                System.out.println("Enter Marks for "+subjects[i]);
                marks[i]=new Scanner(System.in).nextInt();
                if(marks[i]<0||marks[i]>100)
                    System.out.println("Marks can not negative or greater than 100");
            }while(marks[i]<0||marks[i]>100);
        }
        for(int i=0;i<subjects.length;i++)
        {
            int mark = marks[i];
            if(mark>95){
                System.out.println(subjects[i]+" => S - Excellent");
            }else if(mark>=90){
                System.out.println(subjects[i]+" => A - Very Good");
            }else if(mark>=80){
                System.out.println(subjects[i]+" => B - Good");
            }
            else if(mark>=70){
                System.out.println(subjects[i]+" => C - Average");
            }else if(mark>=60){
                System.out.println(subjects[i]+" => D - Can Improve");
            }else if(mark>=50){
                System.out.println(subjects[i]+" => E - Need Improvement");
            }else{
                System.out.println(subjects[i]+" => F - Fail");
            }
        }

        
    } 
}
