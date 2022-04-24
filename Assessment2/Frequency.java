package Assessment2;

public class Frequency {
    public static void main(String[] args) {
        String input =  args[0];
        input = input.toLowerCase();
        for(char c = 97;c<=122;c++)
        {
            int count=0;
            if(input.indexOf(c)>-1)
            {
                for(int i=0;i<input.length();i++)
                {
                    if(input.charAt(i)==c)
                        count++;
                }
                System.out.println(c+" => "+count);
            }
            
        }
    }
}
