import java.util.Scanner;
public class tarushi {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password Rules: \n"+
                "A password must have at least ten characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits \n" 
                );

        String s;
        do{        
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");        
        s = sc.nextLine();

        if (Valid(s)) {
            System.out.println("Password is valid: " + s);
        } 
        else {
            System.out.println("Password is invalid: " + s);
        }
        }while(!Valid(s));

    }

    public static boolean Valid(String password) {
        int password_length = 10;

        if (password.length() < password_length) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
