package company;

import java.util.Scanner;

//JAVA program to reverse the given number.
public class Q14 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String s="";
        while(x!=0)
        {
            int y=x%10;
            s=s.concat(Integer.toString(y));
            x=x/10;
        }
        System.out.println("Reversed number is: "+s);
    }
}
