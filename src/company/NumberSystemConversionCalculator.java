package company;

import java.util.Scanner;
class NotAcceptedInput extends Exception{
    public NotAcceptedInput(String s)
    {
        super(s);
    }
}
class Conversion{
    public  String DecimalToBinary(int num) {
        String str = "";
        while (num > 0) {
            if ((num & 1) == 1)
                str += '1';
            else // 0
                str += '0';
            num >>= 1;
        }

        StringBuilder num1=new StringBuilder(str);
        num1.append(num);
        num1.reverse();

        return num1.toString();
    }
    public int Decimaltooctal(int deciNum)
    {


        int octalNum = 0, countval = 1;
        int dNo = deciNum;

        while (deciNum != 0) {


            int remainder = deciNum % 8;


            octalNum += remainder * countval;


            countval = countval * 10;
            deciNum /= 8;
        }

        return octalNum;
    }
    public String DecimaltoHexadecimal(int num)
    {
        return Integer.toString(num,16);
    }
    public int BinarytoDecimal(String num)
    {
        return Integer.parseInt(num,2);
    }
    public int BinarytoOctal(String num)
    {
        int decimal=Integer.parseInt(num,2);
        return Integer.parseInt(Integer.toOctalString(decimal));
    }
    public String BinarytoHexadecimal(String num)
    {
        int decimal=Integer.parseInt(num,2);
        return Integer.toHexString(decimal);
    }

    public int OctaltoDecimal(String num)
    {
        return Integer.parseInt(num);
    }
    public String OctaltoBinary(String num)
    {
        int octal=Integer.parseInt(num,8);
        return Integer.toBinaryString(octal);
    }
    public String OctaltoHexadecimal(String num)
    {
        int decimal=Integer.parseInt(num,8);
        return Integer.toHexString(decimal);
    }
    public int HexadecimaltoDecimal(String num)
    {
        return Integer.parseInt(num,16);
    }
    public String HexadecimaltoBinary(String num)
    {
        int decimal=Integer.parseInt(num,16);
        return DecimalToBinary(decimal);
    }
    public  int HexadecimaltoOctal(String num)
    {
        int decimal=Integer.parseInt(num,16);
        return Decimaltooctal(decimal);
    }
    }
public class NumberSystemConversionCalculator {
    public static void main(String[] args) {
        while(true) {

            System.out.println("What kind of input you wish to give?");
            System.out.println("1. Decimal");
            System.out.println("2. Binary");
            System.out.println("3. Octa");
            System.out.println("4. HexaDecimal");
            System.out.println("5. Exit");
            System.out.println("Provide input between 1 to 5");
            Scanner sc=new Scanner(System.in);
            try{
            String input=sc.next();
            if(input.equals("1")==true)
            {

                System.out.println("In what form you want the output.");
//                System.out.println("1. Decimal");
                System.out.println("1. Binary");
                System.out.println("2. Octal");
                System.out.println("3. HexaDecimal");
                while(true) {
                    System.out.println("Please provide the input between 1 to 3");

                    String input1 = sc.next();
                    if (input1.equals("1") == true) {
                        String dec="";
                        while(true)
                        {
                            System.out.println("Enter the Decimal number of max Length 8");
                            String pp=sc.next();
                            if(pp.length()>8 || pp.length()==0)
                                continue;
                            else{
                                dec=dec.concat(pp);
                                break;}
                        }
                        System.out.println("Output of Decimal to Binary is: "+new Conversion().DecimalToBinary(Integer.parseInt(dec)));
                        break;
                    } else if (input1.equals("2") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Decimal number of max Length 8");
                            dec=sc.next();
                            if(dec.length()>8 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Decimal to Octal is: "+new Conversion().Decimaltooctal(Integer.parseInt(dec)));
                        break;
                    } else if (input1.equals("3") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Decimal number of max Length 8");
                            dec=sc.next();
                            if(dec.length()>8 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Decimal to Hexadecimal is: "+new Conversion().DecimaltoHexadecimal(Integer.parseInt(dec)));
                        break;
                    } else {
//                        throw new NotAcceptedInput("Invalid input");
                        System.out.println("Please try again");
                    }
                }


            }
            else if(input.equals("2")==true)
            {
                System.out.println("In what form you want the output.");
                System.out.println("1. Decimal");
//                System.out.println("2. Binary");
                System.out.println("2. Octa");
                System.out.println("3. HexaDecimal");
                while(true) {
                    System.out.println("Please provide the input between 1 to 3");

                    String input1 = sc.next();
                    if (input1.equals("1") == true) {
                        String dec;
                        while (true) {
                            System.out.println("Enter the Binary number of max Length 12");
                            dec = sc.next();
                            if (dec.length()>12 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Binary to decimal is: " + new Conversion().BinarytoDecimal(dec));
                        break;
                    } else if (input1.equals("2") == true) {
                        String dec;
                        while (true) {
                            System.out.println("Enter the Binary number of max Length 12");
                            dec = sc.next();
                            if (dec.length()>12 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Binary to Octal is: " + new Conversion().BinarytoOctal(dec));
                        break;
                    } else if (input1.equals("3") == true) {
                        String dec;
                        while (true) {
                            System.out.println("Enter the Binary number of max Length 12");
                            dec = sc.next();
                            if (dec.length()>12 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Binary to Hexadecimal is: " + new Conversion().BinarytoHexadecimal(dec));
                        break;
                    } else {
//                    throw new NotAcceptedInput("Invalid input");
                        System.out.println("Please try again");
                    }
                }
            }
            else if(input.equals("3")==true)
            {
                System.out.println("In what form you want the output.");
                System.out.println("1. Decimal");
                System.out.println("2. Binary");
//                System.out.println("3. Octa");
                System.out.println("3. HexaDecimal");
                while(true) {
                    System.out.println("Please provide the input between 1 to 4");

                    String input1 = sc.next();
                    if (input1.equals("1") == true) {

                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Octal number of max Length 8");
                            dec=sc.next();
                            if(dec.length()>8 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Octal to Decimal is:"+new Conversion().OctaltoDecimal(dec));
                        break;
                    } else if (input1.equals("2") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Octal number of max Length 8");
                            dec=sc.next();
                            if(dec.length()>8 || dec.length()==0)
                                continue;
                            else
                                break;
                        }

                        System.out.println("Output of Octal to Binary is: "+new Conversion().OctaltoBinary(dec));
                        break;
                    } else if (input1.equals("3") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Octal number of max Length 8");
                            dec=sc.next();
                            if(dec.length()>8 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Octal to Hexadecimal is: "+new Conversion().OctaltoHexadecimal(dec));
                        break;
                    } else {
//                    throw new NotAcceptedInput("Invalid input");
                        System.out.println("Please try again");
                    }
                }

            }
            else if(input.equals("4")==true)
            {
                System.out.println("In what form you want the output.");
                System.out.println("1. Decimal");
                System.out.println("2. Binary");
                System.out.println("3. Octa");
//                System.out.println("4. HexaDecimal");
                while(true) {
                    System.out.println("Please provide the input between 1 to 3");

                    String input1 = sc.next();
                    if (input1.equals("1") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Hexadecimal number of max Length 7");
                            dec=sc.next();
                            if(dec.length()>7 && dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Hexadecimal to Decimal:"+new Conversion().HexadecimaltoDecimal(dec));
                        break;
                    } else if (input1.equals("2") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Hexadecimal number of max Length 7");
                            dec=sc.next();
                            if(dec.length()>7 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Hexadecimal to Binary is: "+new Conversion().HexadecimaltoBinary(dec));
                        break;

                    } else if (input1.equals("3") == true) {
                        String dec;
                        while(true)
                        {
                            System.out.println("Enter the Hexadecimal number of max Length 7");
                            dec=sc.next();
                            if(dec.length()>7 || dec.length()==0)
                                continue;
                            else
                                break;
                        }
                        System.out.println("Output of Hexadecimal to Octal is: "+new Conversion().HexadecimaltoOctal(dec));
                        break;

                    }  else {
//                        throw new NotAcceptedInput("Invalid input");
                        System.out.println("Please try again");
                    }
                }
            }
            else if(input.equals("5")==true)
            {
                System.exit(0);
            }
            else{
                throw new NotAcceptedInput("Please try again as your input is invalid.");
            }
            }
            catch (NotAcceptedInput e)
            {
                System.out.println(e);
            }

        }
    }
}
