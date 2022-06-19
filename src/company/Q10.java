package company;

import java.util.Scanner;

//Write a Java program convert given days into months and remaining days. (consider a month of 30 days)
public class Q10 {
    public static void main(String[] args) {
        System.out.println("Enter the number of days");
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        System.out.println(days/30+" months "+days%30+" days");

    }
}
