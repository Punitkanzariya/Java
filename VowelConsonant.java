// Write a program to count the number of words that start with capital letters. 

import java.util.Scanner;
public class VowelConsonant {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your character");
        char ch=in.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}

