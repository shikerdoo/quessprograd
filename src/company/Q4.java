package company;

import java.util.Scanner;

//Write a Java program to accept any four digit number and calculate the sum of first and last digit
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=(int)Math.floor(Math.log10(x)+1);
         if(y!=4)
         {
             System.out.println("You entered a number with more or less than 4 digits");
         }
         else {
             int last=x%10;
             x=x/10;
             x=x/10;
             x=x/10;
             int first=x;
             System.out.println("Sum of first and last digit is: "+(last+first));

         }
    }
}
