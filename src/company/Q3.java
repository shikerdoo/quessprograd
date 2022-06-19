package company;

import java.util.Scanner;
//Write a Java program to accept any three digit number and reverse it (eg . i/p = 512 o/p = 215)
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three digit number:");
        int x=sc.nextInt();
        int y=(int)Math.floor(Math.log10(x) + 1);
        if(y!=3)
        {
            System.out.println("you had to enter three digit number");
        }
        else
        {
            int rev = 0; // reversed number
            int rem;   // remainder



                rem = x%10;
                rev = (rev*10) + rem;
                x = x/10;
                rem = x%10;
                rev = (rev*10) + rem;
                x = x/10;
                rem = x%10;
                rev = (rev*10) + rem;
                 x = x/10;

            System.out.println("Reverse of three digit number is: "+rev);
        }
    }
}
