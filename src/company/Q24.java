package company;

import java.util.Scanner;

//JAVA program to find X to power Y
public class Q24 {
    public static void main(String[] args) {
        System.out.println("Enter the value of x");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter the value of y");
        int y=sc.nextInt();

        int res=1;
        for(int i=1;i<=y;i++)
            res=res*x;
        System.out.println("Result is : "+res );
    }
}
