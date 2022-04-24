package Lab5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {            
            arr[i]=new Scanner(System.in).nextInt();
        }
        int longest = 0;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            
            int current = arr[i];
            int nextIndex = -1;
            int size= 0 ;
            int indices[] = new int[n];
            indices[0]=i;
            int c=1;
            do{
                nextIndex=-1;
                size++;
                for(int j=0;j<n;j++)
                {
                    if(arr[j]==current+1)
                    {
                        nextIndex=j;
                        indices[c]=nextIndex;
                        break;
                    }

                }
                c++;
                current++;
            }while(nextIndex!=-1);

            if(size>longest)
            {
                for(int j=0;j<c;j++)
                {
                    ans[j]=arr[indices[j]];
                }
                longest=size;
            }
        }
        System.out.println("Longest sequence =>");
        for (int i=0;i<longest;i++)
        {
            System.out.print(ans[i]+", ");
        }
        System.out.println("Size = "+longest);
    }
}
