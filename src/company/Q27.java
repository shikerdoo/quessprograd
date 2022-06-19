package company;

import java.util.Scanner;

// JAVA program to find the factors of the given number using constructor.
class PrintFactors{
    private int n;
    PrintFactors(int n)
    {
        this.n=n;
        factors(n);
    }
    private void factors(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(n/i!=i)
                {
                    System.out.print((n/i)+" ");
                    System.out.print(i+" ");
                }
                else
                    System.out.print(i+" ");
            }
        }
    }
}
public class Q27 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        PrintFactors p=new PrintFactors(x);
    }
}
