package Assessment2;
public class Palindrome {
    public static boolean isPalindrome(String a)
    {
        if(a.length()<=1)
            return true;
        
        if(a.charAt(0)==a.charAt(a.length()-1))
        {
            return isPalindrome(a.substring(1,a.length()-1));
        }
        return false;
    }   
    public static void main(String[] args) {
        String input = args[0];
        System.out.println("Input = "+input+"\nLength = "+input.length());
        System.out.println("Palindrome  = "+isPalindrome(input));

    }
}
