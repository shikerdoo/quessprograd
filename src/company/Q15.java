package company;

import java.util.Scanner;

//JAVA program to find factorial of given number.
public class Q15 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int res=1;
        for(int i=2;i<=x;i++)
            res=res*i;
        System.out.println("Factorial of a number "+x+" is: "+res);
    }
}
