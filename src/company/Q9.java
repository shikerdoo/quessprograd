package company;

import java.util.Scanner;

//Write a Java program accept price per item and quantity from user through command line .
//        If quantity is >=10 then give 10% discount on total amount and display final amount to be paid.
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of an item");
        int price=sc.nextInt();
        System.out.println("Enter the quantity in kg");
        int quantity=sc.nextInt();
        System.out.println("Total amount to be paid:");
        if(quantity>=10)
        {
            Double amount=(price*quantity)-(10*price*quantity/100.0);
            System.out.println(amount);
        }
        else
            System.out.println(price*quantity);
    }
}
