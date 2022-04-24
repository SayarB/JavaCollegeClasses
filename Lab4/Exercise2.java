package Lab4;

public class Exercise2 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i=101;i<200;i++)
        {
            if(i%7==0)
            {
                // System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.println("Number of divisible seven => "+count+"\nSum of multiples of 7 => "+sum);      

    }
}
