package company;
//You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
//        pictures or other items. We want to create the text that should be displayed next to such an item.
//        Implement the function which takes an array containing the names of people that like an item.
//        It must return the display text as shown in the examples:

import java.util.ArrayList;
import java.util.Scanner;

//[]                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//For 4 or more names, the number in "and 2 others" simply increases.
public class jj8 {
    public static void main(String[] args) {

        System.out.println("Enter the number of elements you wants to enter");
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<String> a=new ArrayList<>();
//        String[] a=new String[n];
        if(n>1)
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
//            String x=sc.nextLine();

            a.add(sc.next());
        }

        if(a.size()==0)
            System.out.println("No one likes this");
        else if(a.size()==1)
            System.out.println(a.get(0)+" likes this");
        else if(a.size()==2)
            System.out.println(a.get(0)+" and "+a.get(1)+ " likes this");
        else if(a.size()==3)
            System.out.println(a.get(0)+", "+a.get(1)+" and "+a.get(2)+" likes this");
        else
            System.out.println(a.get(0)+", "+a.get(1)+" and "+(a.size()-2)+" others like this");

//        if(n==0)
//            System.out.println("No one likes this");
//        else if(n==1)
//            System.out.println(a[0]+" likes this");
//        else if(n==2)
//            System.out.println(a[0]+" and "+a[1]+ " likes this");
//        else if(n==3)
//            System.out.println(a[0]+", "+a[1]+" and "+a[2]+" likes this");
//        else
//            System.out.println(a[0]+", "+a[1]+" and "+(n-2)+" others like this");
    }
}
