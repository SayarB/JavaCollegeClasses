package Lab3;

public class Exercise1 {
    public static void main(String[] args) {
        int c = 10;
        int d = 20;
        System.out.println("c = "+c);
        System.out.println("Increment =>");
        System.out.println("c++ = "+(c++));
        System.out.println("++c = "+(++c));
        System.out.println("Decrement =>");
        System.out.println("c-- = "+(c--));
        System.out.println("--c = "+(--c));
        System.out.println("\nBitwise Complement =>");
        System.out.println("~c = "+(~c));
        System.out.println("\nArithmetic Operator =>");
        System.out.println("c = "+c+"\nd = "+d);
        System.out.println("\nc + d = "+(c+d));
        System.out.println("c - d = "+(c-d));
        System.out.println("c * d = "+(c*d));
        System.out.println("c / d = "+(c/d));
        System.out.println("c % d = "+(c%d));
        System.out.println("\nRelation Operator");
        System.out.println("c == d => "+(c==d));
        System.out.println("c != d => "+(c!=d));
        System.out.println("c < d => "+(c<d));
        System.out.println("c > d => "+(c>d));
        System.out.println("c <= d => "+(c<=d));
        System.out.println("c >= d => "+(c>=d));
        System.out.println("\nBitwise Operator =>");
        System.out.println("c | d = "+(c|d));
        System.out.println("c & d = "+(c&d));
        System.out.println("c ^ d = "+(c^d));
        int left_shift = (c<<2);
        int right_shift = (c>>2);
        System.out.println("c << 2 ="+left_shift);
        System.out.println("c >> 2 = "+right_shift);
        System.out.println("c >>> 2 = "+(c>>>2));
        System.out.println("c<d?\"c is lesser\":\"c is greater\" = "+(c<d?"c is lesser":"c is greater"));
    }
}