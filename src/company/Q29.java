package company;

import java.util.Scanner;

//Write a Java program to print alternate prime numbers up to given number.
public class Q29 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int counter=0;
        for(int i=2;i<=x;i++)
            if(isPrime(i)==true)
            {
                if(counter%2==0)
                    System.out.println(i+" ");
                counter++;
            }
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
