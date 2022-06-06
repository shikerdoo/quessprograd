package company;

import java.util.ArrayList;
import java.util.Scanner;



//35. JAVA program to find transpose of a given matrix. 36. Write a Java program to find nth prime number.
public class jj1 {
    static ArrayList<Integer> primes =
            new ArrayList<Integer>();
    static int MAX_SIZE = 1000005;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter m");
        m=sc.nextInt();
//        System.out.println("Enter n");
//        n=sc.nextInt();
        System.out.println("Enter the elements");
        int [][]arr=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        Q35(arr,m);
        System.out.println("Enter a number to get nth prime number");
        int mm=sc.nextInt();
        Q36();
        System.out.println(primes.get(mm-1));
    }

    public static void Q35(int arr[][],int m)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    // To store all prime numbers


    // Function to generate N prime numbers
    // using Sieve of Eratosthenes
    static void Q36()
    {
        // Create a boolean array "IsPrime[0..MAX_SIZE]"
        // and initialize all entries it as true.
        // A value in IsPrime[i] will finally be false
        // if i is Not a IsPrime, else true.
        boolean [] IsPrime = new boolean[MAX_SIZE];

        for(int i = 0; i < MAX_SIZE; i++)
            IsPrime[i] = true;

        for (int p = 2; p * p < MAX_SIZE; p++)
        {
            // If IsPrime[p] is not changed,
            // then it is a prime
            if (IsPrime[p] == true)
            {
                // Update all multiples of p greater than or
                // equal to the square of it
                // numbers which are multiple of p and are
                // less than p^2 are already been marked.
                for (int i = p * p; i < MAX_SIZE; i += p)
                    IsPrime[i] = false;
            }
        }

        // Store all prime numbers
        for (int p = 2; p < MAX_SIZE; p++)
            if (IsPrime[p] == true)
                primes.add(p);
    }





}
