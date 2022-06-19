package company;

import java.util.Scanner;

//Write a Java program to input the Principle amount and
// time period in years, consider the rate of interest as 7.5%. Find the amount of simple interest and the final amount paid to the Bank
public class Q2 {
    public static void main(String[] args) {
        Double principal;
        System.out.println("Enter the principal:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time:");
        principal=sc.nextDouble();
        Double time=sc.nextDouble();
        System.out.println("Simple Interest: "+(principal*time*7.5)/100D);
        System.out.println("Amount to be paid: "+(principal+(principal*time*7.5)/100D));
    }
}
