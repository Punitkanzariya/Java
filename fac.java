// Design a class which finds out the factorial of a given number using recursion.

import java.util.*;
public class fac{
    public static int fact(int i){
        if(i==1){
            return 1;
        }
        else{
            return i*fact(i-1);
        }
    } 
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int a;
            System.out.println("Enter value:");
            a=in.nextInt();
            System.out.println("Factorial is:"+fact(a));
    }
}