import java.util.Scanner;

public class Metertofeet
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int meter;
        System.out.println("Enter value of meter:");
        meter = in.nextInt();
        double feet;
        feet = 3.28084 * meter;
        System.out.println("Feet of "+meter+" is:"+feet);
    }
}