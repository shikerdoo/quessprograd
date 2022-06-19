package company;

import java.util.Scanner;

// JAVA program to check given year is leap or not.
public class Q20 {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
          if(leap(year)==true)
              System.out.println("Leap year");
          else
              System.out.println("Not a leap year");
    }
    public static boolean leap(int year)
    {
        if(year%400==0)
            return true;
        if(year%100==0)
            return false;
        if(year%4==0)
            return true;

        return false;
    }
}
