package company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q31toQ34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        Q30(arr);
        Q31(arr,n);
        Q32(arr);
        Q33(arr);
        Q34(arr);
    }
    public static void Q30(int arr[])
    {
        System.out.println("Reverse elements");
        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);
    }
    public static  void Q31(int arr[],int n)
    {
        int brr[]=new int[n];
        brr=arr;
        System.out.println("Copied elements");
        for(int i=0;i<n;i++)
            System.out.println(brr[i]);

    }
    public static void Q32(int arr[])
    {
       int count=0;
       Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    s.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println("Count of number of duplicates");
        System.out.println(s.size());
    }
    public static void Q33(int arr[])
    {
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
            s.add(arr[i]);

        System.out.println("No of unique elements");
        System.out.println(s.size());
    }

    public static void Q34(int arr[])
    {
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
            s.add(arr[i]);
        int brr[]=new int[s.size()];
        int i=0;
        for(Integer ss:s)
        {

            brr[i++]=ss;}

        Arrays.sort(brr);
        System.out.println("Second largest elements");
        System.out.println(brr[brr.length-2]);
    }
}
