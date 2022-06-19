package company;
// JAVA program to print all prime factors of given number.

import java.util.ArrayList;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i*i<=x;i++)
        {
            if(x%i==0)
            {
                if(x/i!=i)
                {
                    a.add(i);
                    a.add(x/i);
                }
                else
                    a.add(i);
            }
        }
        for(Integer y:a)
            System.out.println(y);
    }
}
