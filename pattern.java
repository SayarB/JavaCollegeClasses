public class pattern {
    public static void main(String[] args) {
        int n=5;
        int c1,r1,r2;
        c1=1;        
        r1=n;
        r2=0;
        for(int i=1;i<=n;i++)
        {
            int c=c1;
            for(int j=1;j<=r1;j++)
            {
                System.out.print(c+" ");
                c+=2;
            }
            for(int j=1;j<=r2;j++)
            {
                System.out.print((i-1)+" ");
            }
            
            System.out.println();
            c1+=2;
            r1--;
            r2++;
        }
    }
}
/*
___*
__***
_*****
*******
_*****
__***
___*

*/