// Write a program that solves the following  equation and displays the value x and y: 1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )


public class Cramer
{
    public static void main(String[] args)
    {
        double a=3.4;
        double b=50.2;
        double c=2.1;
        double d=0.55;
        double e=44.5;
        double f=5.9;
        double x= ((e*d)-(b*f))/((a*d)-(b*c));
        System.out.println("Value of X:"+x);
        double y= ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Value of Y:"+y);
    }
}