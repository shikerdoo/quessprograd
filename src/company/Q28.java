package company;

import java.util.Scanner;

// Write a Java program to find table of given number using recursion.
public class Q28 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        table(x,10);
    }
    public static void table(int x,int i)
    {
        if(i==0)
            return;
        table(x,i-1);
        System.out.println(x+" x "+i+" = "+(x*i));
    }
}
