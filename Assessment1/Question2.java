package Assessment1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);   
        System.out.print("Enter order of matrix (M X N format) = ");
        String inp1 = sc.nextLine();
        String[] input1 = inp1.split("X");
        int m = Integer.parseInt(input1[0].trim());
        int n = Integer.parseInt(input1[1].trim());
        int arr1[][]=new int[m][n];
        System.out.println("Enter Matrix");
        for (int i=0;i<m;i++)        
            for(int j=0;j<n;j++)            
                arr1[i][j]=Integer.parseInt( sc.next());

        
        int arr2[][]=new int[m][n];
        System.out.println("Enter Matrix");
        for (int i=0;i<m;i++)        
            for(int j=0;j<n;j++)            
                arr2[i][j]=Integer.parseInt( sc.next());

        
        int sum[][]=new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        int product[][]=new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                for (int k=0;k<m;k++)
                {
                    product[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Sum Matrix =>");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Product Matrix =>");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}
