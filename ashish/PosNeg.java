package ashish;
import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        System.out.print("Enter length of array => ");
        int n=new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        int posNum = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = new Scanner(System.in).nextInt();
            if(arr[i]>0)
                posNum++;
        }
        int positive[] = new int[posNum];
        int negative[] = new int[arr.length-posNum];
        int posIndex = 0;
        int negIndex = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
                positive[posIndex++]=arr[i];
            else
                negative[negIndex++]=arr[i];
        }
        System.out.print("Positive => ");
        for(int ele:positive)
            System.out.print(ele+", ");
        System.out.print("\nNegative => ");
        for(int ele:negative)
            System.out.print(ele+", ");
        
    }
}
