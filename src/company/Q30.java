package company;

import java.util.Scanner;

//JAVA program to read n number of values in an array and display it in reverse order.
public class Q30 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements you wish to enter");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements one by one");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
