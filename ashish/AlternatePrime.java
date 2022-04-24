package ashish;

public class AlternatePrime {
    public static boolean isPrime(int n)
    {
        if(n==2)
            return true;
        for(int i=2;i<Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int limit = 100;
        boolean toggle = true;
        for(int i=2;i<=limit;i++)
        {
            if(isPrime(i) )
            {
                if(toggle)
                    System.out.print(i+", ");                
                toggle=!toggle;
            }
            
        }
    }
}
