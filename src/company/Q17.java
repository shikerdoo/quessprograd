package company;

import java.util.Scanner;

//JAVA program to check given number is palindrome or not
public class Q17 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String s=Integer.toString(x);
        int low=0;
        int high=s.length()-1;
        int k=0;
        while (low<=high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
             k=1;
                System.out.println("Not a palindrome");
                break;
            }
            low++;
            high--;
        }

        if(k==0)
            System.out.println("Palindrome");
    }
}
