import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Hackathon1 {
    public static void main(String[] args)throws  IOException  {
       while(true) {
           System.out.println("Menu of the game.");
           System.out.println("1. start the game.");
           System.out.println("2. Check Highest Score.");
           System.out.println("3. Exit the game");
           System.out.println("You can enter the number of your choice from the mentioned menu.");
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           try {
               if (Integer.parseInt(s) == 1) {
                   System.out.println("Enter the player names");
                   System.out.println("Enter first player name:");
                   String s1=sc.next();
                   System.out.println("Enter the second player name:");
                   String s2=sc.next();
                   while(true) {
                       System.out.println("Tell me how many times you want to play");
                       String s3= sc.next();
                       try {
                           int x=Integer.valueOf(s3);
                           System.out.println(x);
                           System.out.println("As we Know game is going to start. Therefore, we are letting you know what choices you have to make.");
                           System.out.println("Stone means 's'");
                           System.out.println("Paper means 'p'");
                           System.out.println("Scissor means 'S'");
                           int count1=0,count2=0;

                           for(int i=1;i<=x;i++)
                           {
                             char cc,cc1;
                             String s4="",s5="";
                             boolean aa=true;
                                while(aa) {
                                    System.out.println(s1+" its your turn.");
//                                    cc=sc.nextLine().charAt(0);
                                    s4=s4.concat(sc.next());
                                    if(s4.equals("s")==true || s4.equals("p")==true|| s4.equals("S")==true)
                                    {
                                        aa=false;
                                        continue;
                                    }
//                                    System.out.println(cc);
//
//                                    if(cc=='s' || cc=='p' || cc=='S'){
//
//                                        break;}

                                    System.out.println("Invalid Input try again");
                                }
                                aa=true;
                               while(aa) {
                                   System.out.println(s2+" its your turn.");
//                                    cc1=sc.nextLine().charAt(0);

                                   s5=s5.concat(sc.next());

                                   if(s5.equals("s")==true || s5.equals("p")==true|| s5.equals("S")==true)
                                   {
                                       aa=false;
                                       continue;
                                   }
//                                   if(cc1=='s' || cc1=='p' || cc1=='S')
//                                       break;
                                   System.out.println("Invalid Input try again");
                               }
                          if(s4.equals("s")==true && s5.equals("p")==true)
                              count2++;
                          else if(s4.equals("p")==true && s5.equals("s")==true)
                              count1++;
                          else if(s4.equals("S")==true && s5.equals("p")==true)
                              count1++;
                          else if(s4.equals("p")==true && s5.equals("S")==true)
                              count2++;
                          else if(s4.equals("s")==true && s5.equals("S")==true)
                              count1++;
                          else if(s4.equals("S")==true && s5.equals("s")==true)
                              count2++;
//                               if(cc=='s' && cc1=='p')
//                                   count2++;
//                               else if(cc=='p' && cc1=='s')
//                                   count1++;
//                               else if(cc=='S' && cc1=='p')
//                                   count1++;
//                               else if(cc=='p' && cc1=='S')
//                                   count2++;
//                               else if(cc=='s' && cc1=='S')
//                                   count1++;
//                               else if(cc=='S' && cc1=='s')
//                                   count2++;

                           }
//                           Path path = Files.createTempFile("file1", ".txt");
//                           boolean exists = Files.exists(path);

                           File file=new File("/home/fyriousfighter/IntelliJIDEAProjects/quessPrograd/file1.txt");

                               int ss=1;
                           String sss="";
                          if(file.length()==0L)
                          {  ss=0;

                          }

//                           System.out.println(count1);
//                           System.out.println(count2);

                           if(ss==1) {
                               FileReader fileReader = new FileReader("file1.txt");
                               int k;

                               while((k=fileReader.read())!=-1)
                               {

                                   sss=sss.concat(Character.toString((char)k));
                               }
                               fileReader.close();
                           }
                           System.out.println(sss);
                           int u=0;
                           if(sss.equals("")==false)
                           {
//                               System.out.println("yes");
                               u=Integer.parseInt(sss);}
                          if(file.length()==0L)
                              System.out.println("Empty");
                           FileWriter fileWriter = new FileWriter("file1.txt");
                           if(count1>count2) {
                               System.out.println(s1 + " wins");
                              if(ss==0) {
                                  String pp=String.valueOf(count1);
                                  for(int i=0;i<pp.length();i++)
                                      fileWriter.write(pp.charAt(i));
                              }
                               else if(ss==1 && u<count1) {
                               String pp=String.valueOf(count1);
                               for(int i=0;i<pp.length();i++)
                                  fileWriter.write(pp.charAt(i));
                              }
                           }
                           else if(count2>count1){
                               System.out.println(s2+" wins");
                              if(ss==0) {
                                  String pp=String.valueOf(count2);
                                  for(int i=0;i<pp.length();i++)
                                      fileWriter.write(pp.charAt(i));
                              }
                              else if(ss==1 && u<count2) { String pp=String.valueOf(count2);
                                  for(int i=0;i<pp.length();i++)
                                      fileWriter.write(pp.charAt(i));
                              }
                           }
                           else if(count1==count2){
                               System.out.println("draw");
                               if (ss==0)
                               {
                                   String pp=String.valueOf(count1);
                                   for(int i=0;i<pp.length();i++)
                                       fileWriter.write(pp.charAt(i));
                               }
                               else if(ss==1 && u<count1)
                               {
                                   String pp=String.valueOf(count1);
                                   for(int i=0;i<pp.length();i++)
                                       fileWriter.write(pp.charAt(i));
                               }
                           }

                         fileWriter.close();
                       } catch (NumberFormatException e) {
                           System.out.println("Invalid Input "+e);
                       }

                   }
               } else if (Integer.parseInt(s) == 2) {
                   FileReader fileReader=new FileReader("file1.txt");
                   int k;
                  String sss="";
                   while((k=fileReader.read())!=-1)
                   {
                       sss=sss.concat(Character.toString((char)k));

                   }
                   System.out.println("Highest Score of the game till now is: "+sss);

               } else if (Integer.parseInt(s) == 3) {

                   System.exit(0);
               }
               else
                   System.out.println("Invalid input");
           } catch (NumberFormatException e) {
               System.out.println("Invalid Input try again");


           }

       }
    }
}
