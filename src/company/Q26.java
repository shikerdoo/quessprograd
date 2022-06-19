package company;

import java.util.Scanner;

// JAVA program to print Fibonacci series up to given term.
public class Q26 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []fib=new int[x+1];
        fib[0]=0;
        fib[1]=1;
        System.out.print(fib[1]+" ");
        for(int i=2;i<=x;i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i]+" ");
        }
    }
}
