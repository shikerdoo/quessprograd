package company;

import java.util.Scanner;

//JAVA program to generate fibonacci triangle
public class Q25 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []fib=new int[x+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=x;i++)
            fib[i]=fib[i-1]+fib[i-2];

        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(fib[j]+" ");
            System.out.println();
        }
    }
}
