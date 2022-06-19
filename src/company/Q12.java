package company;

import java.util.ArrayList;
import java.util.Scanner;

//JAVA Program to Display Prime Numbers between Two Intervals.
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give first value");
        int l=sc.nextInt();
        System.out.println("Give second value");
        int h=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        Sieve(a,(int)Math.sqrt((double)h));
//        ArrayList<Integer> b=new ArrayList<>();

        boolean []isPrime=new boolean[h-l+1];
        for (int i=0;i<h-l+1;i++)
            isPrime[i]=true;
        for(Integer x:a)
        {
            int base=(l/x)*x;
            if(base<l)
                base=base+x;
            for(int j=base;j<=h;j+=x)
            {
                isPrime[j-l]=false;
            }
            if(base==x)
                isPrime[base-l]=true;
        }
        for(int i=0;i<=h-l;i++)
            if(isPrime[i]==true)
                System.out.println((i+l));

    }
    public static void Sieve(ArrayList<Integer> a,int n)
    {
        boolean []isPrime=new boolean[n] ;
        for(int i=0;i<n;i++)
            isPrime[i]=true;
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                    isPrime[j]=false;
            }
        }
        for(int i=2;i<n;i++)
            if(isPrime[i]==true)
                a.add(i);
    }
}
