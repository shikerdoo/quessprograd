package company;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a java program that let the user choose his/her username and password. The program verifies whether
//        the chosen username and password are valid. If either one of them is invalid, it notifies the user by raising
//        exception and explain the cause of invalidity. The rules for choosing valid usernames and passwords are:
//        a. A username must be of length 6-15 characters.
//        b. A username must start with an uppercase English alphabet A to Z.
//        c. A password must not be shorter than 8 characters but must not exceed 256.
//        d. There cannot be any types of parentheses or whitespaces in a valid username or password.
//        e. A password cannot contain or be the same as its associated username
public class jj6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Username:");
//        String s1=sc.nextLine();


        try{
            System.out.println("Enter the Username:");
            String s1=sc.nextLine();
            if(s1.contains("(")==true || s1.contains(")")==true || s1.contains(" ")==true)
                throw new InputMismatchException("Invalid Username");
            else if((s1.length()>=6 && s1.length()<=15) && Character.isUpperCase(s1.charAt(0)))
                System.out.println("Valid username");

            else
                throw new InputMismatchException("Invalid Username");
            System.out.println("Enter the password:");
            String s2=sc.nextLine();
            if(s2.contains("(")==true || s2.contains(")")==true || s2.contains(" ")==true)
                throw new InputMismatchException("Invalid Username");
            else if(s2.length()>=8 && s2.length()<=256 && s1!=s2)
                System.out.println("Valid Password");

            else
                throw new InputMismatchException("Invalid Password");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
