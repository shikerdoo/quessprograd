package company;

import java.util.Scanner;

//In the University Examinations conducted during the past 5 years, the toppers
// registration numbers were 7126, 82417914, 7687 and 6657. Your father is an expert
// in data mining and he could easily infer a pattern in the toppers registration numbers.
// In all the registration numbers listed here, the sum of the odd digits is equal to the sum of
// the even digits in the number. He termed the numbers that satisfy this property as Probable Topper Numbers.
// Write a program to find whether a given number is a probable topper number or not.
public class Q37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=(int)Math.floor(Math.log10(n) + 1);
        if(x%2==0)
        {
            int p=n;
            int sume=0;
            int sumo=0;
            int s=0;
            while(p!=0)
            {
                if(s==0)
                {
                    sume+=p%10;
                    p=p/10;
                    s=1;
                }
                else {
                    sumo+=p%10;
                    p=p/10;
                    s=0;
                }
            }
            if(sume==sumo)
                System.out.println("Probable topper");
            else
                System.out.println("No");
        }
        else
        {
            int p=n;
            int sume=0;
            int sumo=0;
            int s=0;
            while(p!=0)
            {
                if(s==1)
                {
                    sume+=p%10;
                    p=p/10;
                    s=0;
                }
                else {
                    sumo+=p%10;
                    p=p/10;
                    s=1;
                }
            }
            if(sume==sumo)
                System.out.println("Probable topper");
            else
                System.out.println("No");
        }
    }
}
