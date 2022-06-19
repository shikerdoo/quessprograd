package company;

import java.util.Scanner;

//JAVA Program to Display Armstrong Number between Two Intervals.
public class Q21 {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        System.out.println("Enter second number");
        int high=sc.nextInt();
        for(int i=low;i<=high;i++)
            if(armstrong(i)==true)
                System.out.println(i);
    }
    static boolean armstrong(int n)
    {
        int length=(int)Math.floor(Math.log10((double) n)+1);
        int p=n;

        int sum=0;
        while(p!=0)
        {
            sum+=(int)Math.pow(p%10,length);
            p=p/10;
        }
        if(sum==n)
            return true;
        return false;
    }
}
