import java.util.Scanner;

public class aishani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth=sc.nextInt();
        if(length==breadth)
        {
            System.out.println("Square");
        }else{
            System.out.println("Not");
        }
    }
}
