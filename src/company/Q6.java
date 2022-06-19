package company;

import java.util.Scanner;

//Write a Java program for bonus calculation. Accept basic salary from user. Calculate TA = 10%, DA= 15%,
//        HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then give 10% bonus
//        otherwise give 20% bonus on basic salary. Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary");
        int basic=sc.nextInt();
        if(basic>=20000)
        {
            Double gross=basic+(15*basic/100.0)+(10*basic/100.0)+(20*basic/100.0)+(10*basic/100.0)-(12*basic/100.0);
            System.out.println(gross);
        }
        else
        {
            Double gross=basic+(15*basic/100.0)+(10*basic/100.0)+(20*basic/100.0)+(20*basic/100.0)-(12*basic/100.0);
            System.out.println(gross);
        }
    }
}
