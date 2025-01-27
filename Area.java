// Write a java program to find out the area of circle and area of rectangle using the concept of method overloading.

import  java.util.*;
public class Area{
    public static void area(int l,int w){
        System.out.println("Area of Rectangle:"+l*w);
    }
    public static void area(double r){
        double pi=3.14;
        System.out.println("Area of Circle:"+pi*r*r);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int l,w,r;
        System.out.println("Enter radius of circle:");
        r=in.nextInt();
        area(r);
        System.out.println("Enter length of rectangle:");
        l=in.nextInt();
        System.out.println("Enter width of rectangle:");
        w=in.nextInt();
        area(l,w);
    }
}