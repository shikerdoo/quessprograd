package company;

import java.util.Scanner;

//Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
//        If driver is married
//        If driver is unmarried male and age above 30
//        If driver is unmarried female and age above 25
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you a male or female.Male as 'm' and female as 'f'");
        String maleorfemale=sc.next();
        System.out.println("Are you married or not press yes or y if you are married and no or n if you are unmarried");
        String martialstatus=sc.next();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(martialstatus.equals("yes")==true || martialstatus.equals("y")==true)
            System.out.println("yes you are a driver");
        else if(maleorfemale.equals("m")==true&&(martialstatus.equals("no")||martialstatus.equals("n")) && age>30)
            System.out.println("yes you are a driver");
        else if(maleorfemale.equals("f")==true && (martialstatus.equals("no")==true || martialstatus.equals("n")==true)&& age>25)
            System.out.println("yes you are a driver");
        else
            System.out.println("You might not meeting the above conditions");

    }
}
