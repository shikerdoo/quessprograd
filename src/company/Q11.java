package company;

import java.util.Scanner;
//JAVA Program to Check Whether a Number is Prime or Not.
public class Q11 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)==true)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");

    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
