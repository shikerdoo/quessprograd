package company;

import java.util.Scanner;

//Given a string of words, you need to find the highest scoring word.
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//        You need to return the highest scoring word as a string.
//        If two words score the same, return the word that appears earliest in the original string.
//        Provided : All letters will be lowercase and all inputs will be valid.
public class jj9 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String of words seperated with spaces");
        s=sc.nextLine();
        String w = "";
        int max= Integer.MIN_VALUE;

        for (String ww : s.split(" ")) {
            int total = 0;
            for (char cc : ww.toCharArray()) {
                total += cc - 96; // the int value of "a" is 97
            }
            if (total > max) {
                max = total;
                w = ww;
            }
        }
        System.out.println(w);
    }
}
