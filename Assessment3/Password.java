import java.util.Scanner;

public class Password {
    public static boolean validPassword(String pass)
    {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        if(pass.length()<10)
            return false;
        int digitNum = 0;        
        for(int i=0;i<pass.length();i++)
        {
            char ch = pass.charAt(i);
            if(alphabets.indexOf(ch)==-1 && alphabets.toUpperCase().indexOf(ch)==-1 && digits.indexOf(ch)==-1)
                return false;
            if(digits.indexOf(ch)>-1)
                digitNum++;
        }
        return digitNum>=2 && pass.length()-digitNum>0;
    }
    public static void main(String[] args) {
        System.out.println("Password Rules:\nA password must have at least ten characters.\nA password consists of only letters and digits.\nA password must contain at least two digits.");
        
        String input;

        do{
            System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");

            input = new Scanner(System.in).next();
            if(validPassword(input))
                System.out.println("Password is valid : "+input);
            else
            {
                System.out.println("Password is not valid");
            }
        }while(!validPassword(input));
    }
}
