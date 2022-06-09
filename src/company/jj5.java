package company;

import java.util.InputMismatchException;
import java.util.Scanner;

//You will be given two integers x and y as input, you have to compute x/y .
//  If x and y are not 32 bit signed integers or if
//  y is zero, exception will occur and you have to report it.
public class jj5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
        if(((x<= 2147483647) && (x >= -2147483648))==false && ((y<= 2147483647) && (y >= -2147483648))==false && y!=0)
        {
//            throw new ArithmeticException("This is an Exception");
            System.out.println("Valid input");
        }
        else if(y==0)
            throw new ArithmeticException("Invalid input");
        else
        {
            System.out.println(x/y);
        }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}
