package company;

import java.util.Scanner;

//JAVA program to check given number is perfect or not.
public class Q19 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=1;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                if(x/i!=i)
                {
                    sum+=(x/i)+i;
                }
                else sum+=i;
            }
        }

        if(sum==x && x!=1)
            System.out.println("Perfect");
        else
            System.out.println("Not perfect");

    }
}
