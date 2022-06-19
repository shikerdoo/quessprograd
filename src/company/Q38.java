package company;

import java.util.Scanner;

//A magic square is an arrangement of numbers
// (usually integers) in a square grid, where the numbers in each row,
// and in each column, and the numbers in the forward and backward main diagonals,
// all add up to the same number. Write a program to find whether a given matrix is a magic
// square or not. The first integer corresponds to the number of rows/columns in the matrix.
// The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order
// , first row first, then second row and so on. Print "yes" if it is a magic square. Print "no" if it is not a magic square.
public class jj3 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
     int n=sc.nextInt();
        System.out.println("Enter the elements");
     int arr[][]=new int[n][n];
     for(int i=0;i<n;i++)
         for(int j=0;j<n;j++)
             arr[i][j]=sc.nextInt();

     int sumd1=0,sumd2=0;
     for(int i=0;i<n;i++)
     {
         sumd1+=arr[i][i];
         sumd2+=arr[i][n-1-i];
     }
     if(sumd1!=sumd2)
     {
         System.out.println("No");
     }
     else
     {
         int s=0;
         for(int i=0;i<n;i++)
         {
             int rowsum=0,colsum=0;
             for(int j=0;j<n;j++)
             {
                 rowsum+=arr[i][j];
                 colsum+=arr[j][i];
             }
             if(rowsum!=colsum || colsum!=sumd1 )
             {
                 s=1;
                 System.out.println("No");
                 break;
             }
         }

         if(s==0)
         {
             System.out.println("Yes");
         }
     }

    }
}
