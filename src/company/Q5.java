package company;

import java.util.Scanner;

//Write a Java program to accept three values for angle of triangle and check it is valid triangle or not.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a!=0 && b!=0 && c!=0 && (a+b+c)==180)
            System.out.println("Yes it is a valid triangle.");
        else
            System.out.println("Not a valid triangle");
    }
}
