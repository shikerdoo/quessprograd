package company;

import java.util.Scanner;

//JAVA program to print sum of digits. (eg. 512 = 8)
public class Q13 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x!=0)
        {
            sum+=x%10;
            x=x/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
