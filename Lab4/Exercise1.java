package Lab4;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c= new Scanner(System.in).nextInt();

        if(a<b && b<c)
        {
            System.out.println("Increasing Order");
        }else if(a>b && b>c)
        {
            System.out.println("Decreasing Order");
        }
        else{
            System.out.println("Neither Increasing nor decreasing");
        }

    }
}
