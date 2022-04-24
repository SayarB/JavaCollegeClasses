package Assessment2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the Sentence");
        String line = new Scanner(System.in).nextLine();


        String[] words = line.split(" ");
        String rev = "";
        System.out.println("The given string is: "+line);
        for(String word:words)
        {
            rev=word+" "+rev;
        }
        System.out.println("The string with reversed words: "+rev);
    }
}
