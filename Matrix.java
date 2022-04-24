import java.util.Scanner;

public class Matrix {
    static int[][] multiplyMatrix(int[][] mat1, int[][]mat2)
    {
        int sum[][]=new int[mat1.length][mat1.length];
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++)
            {
                int prod = 0;
                for(int k=0;k<mat2[i].length;k++)
                {
                    prod += mat1[i][k]*mat2[k][j];
                }
                sum[i][j] = prod;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix 1 =>");
        int[][]mat1 = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                mat1[i][j] = Integer.parseInt(sc.next());
        }
        System.out.println("Enter Matrix 2 =>");
        int[][]mat2 = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                mat2[i][j] = Integer.parseInt(sc.next());
        }
        int sum[][] = multiplyMatrix(mat1, mat2);

        System.out.println("Sum Matrix => ");

        for(int[] row: sum)
        {
            for(int col: row)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }


    }
}
