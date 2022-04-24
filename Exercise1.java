import java.util.*;
class Exercise1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.nextLine();
        System.out.println("Enter Register Number");
        String reg_num = sc.nextLine();
        System.out.println("Enter Branch");
        String branch = sc.nextLine();
        System.out.println("\nOutput => \nUsername = "+username+"\nRegister Number = "+reg_num+"\nBranch = "+branch);        
    }
}