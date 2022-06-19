package company;

import java.util.Scanner;

//Given a string of digits, you should replace any digit below 5 with '0'
//        and any digit 5 and above with '1'. Return the resulting string.
//        Note: input will never be an empty string
public class jj7 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();
        String ss="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))==true&&Integer.parseInt(String.valueOf(s.charAt(i)))<5)
                ss=ss.concat("0");
            else if(Character.isDigit(s.charAt(i))==true&&(Integer.parseInt(String.valueOf(s.charAt(i)))==5 || Integer.parseInt(String.valueOf(s.charAt(i)))<=9))
                ss=ss.concat("1");
            else

                ss=ss.concat(Character.toString(s.charAt(i)));
        }
        System.out.println(ss);
    }
}
