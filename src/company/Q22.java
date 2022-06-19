package company;

import java.util.Scanner;

//JAVA program to print table of given number.
public class Q22 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(x+" x "+i+" = "+(x*i));
    }
}
