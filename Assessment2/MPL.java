import java.util.Scanner;

public class MPL {
    private int standard;
    private int numStudents;
    private int[] marks;
    private int firstMarks;
    public MPL(int std, int num)
    {
        standard=std;
        numStudents=num;
        marks = new int[numStudents];
        System.out.println("Standard "+standard+"\nEnter the marks of "+numStudents+" students => ");
        int max = 0;
        for(int i=0;i<numStudents;i++)
        {
            marks[i]=new Scanner(System.in).nextInt();
            if(marks[i]>max)
                max=marks[i];
        }
        firstMarks=max;
    }
    // public int getFirstMarks()
    // {
    //     return firstMarks;
    // }
    // public int getStandard()
    // {
    //     return standard;
    // }
    // public int[] getMarks()
    // {
    //     return marks;
    // }
    public static void findBestClass(MPL[] standards)
    {
        MPL max = standards[0];
        for (MPL std:standards)
        {
            if(std.firstMarks>max.firstMarks)
            {
                max = std;
            }                
        }
        System.out.println("Standard with best first marks => "+max.standard+"\nFirst Marks = "+max.firstMarks);
    }
    public static void findBestClass(MPL[] standards, double[] average)
    {
        MPL max=standards[0];
        double maxAvg = average[0];
        for(int i=0;i<average.length;i++)
        {
            if(maxAvg<average[i])
            {
                maxAvg=average[i];
                max=standards[i];
            }
        }
        System.out.println("Standard with maximum average = "+max.standard+"\nAverage = "+maxAvg);
    }
    public static void main(String[] args)
    {
        MPL std1 = new MPL(1,5);
        MPL std2 = new MPL(2,5);
        MPL std3 = new MPL(3,5);
        MPL std4 = new MPL(4,5);
        MPL[] mplArray = new MPL[]{std1,std2,std3,std4}; 
        double avg[]= new double[4];
        for(int i=0;i<mplArray.length;i++)
        {
            int sum = 0;
            for(int mark:mplArray[i].marks)
            {
                sum+=mark;
            }
            avg[i]= sum*1.0/mplArray[i].numStudents;
        }
        findBestClass(mplArray);
        findBestClass(mplArray,avg);
    }
}
