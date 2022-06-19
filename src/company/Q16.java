package company;

import java.util.Scanner;

//JAVA program to check given number is Armstrong or not.
public class Q16 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int length=(int)Math.floor(Math.log10((double)x)+1);

        int y=x;
        int sum=0;
        while(y!=0)
        {
            sum+=(int)Math.pow(y%10,length);
            y=y/10;
        }
        if(x==sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
