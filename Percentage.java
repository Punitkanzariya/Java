// Write a program that calculates percentage marks of the student if marks of 6 subjects are given.


import java.util.Scanner;

public class Percentage{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float m1,m2,m3,m4,m5,m6;
        System.out.println("enter marks 1:");
        m1 = in.nextLong();
        System.out.println("enter marks 2:");
        m2 = in.nextLong();
        System.out.println("enter marks 3:");
        m3 = in.nextLong();
        System.out.println("enter marks 4:");
        m4 = in.nextLong();
        System.out.println("enter marks 5:");
        m5 = in.nextLong();
        System.out.println("enter marks 6:");
        m6 = in.nextLong();
        float totalobtained;
        totalobtained = m1+m2+m3+m4+m5+m6;
        System.out.println("Total marks is:"+ totalobtained);
        float persontage;
        persontage= totalobtained * 100 / 600;
        System.out.println("Persontage is:"+ persontage);

    }
}