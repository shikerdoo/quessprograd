package company;

import java.util.Scanner;

//Write a Java program to find greater between three numbers using nested ternary operator.
public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        System.out.println("Greatest number between three number is"+((a>b)?(a>c?a:c):(b>c?b:c)));
    }
}
