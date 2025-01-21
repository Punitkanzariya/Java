// Write a program to count the number of words that start with capital letters. 


import java.util.*;
public class Capitalletter{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter your line:");
        s=in.nextLine();
        System.out.println(s);
        char c;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>=65 && c<=90)
            {
                count++;
            }
        }
        System.out.println("Number of world which start with capital letter:"+count);
    }
}
