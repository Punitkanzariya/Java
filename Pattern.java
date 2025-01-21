// Write an interactive program to print a string entered in a pyramid form. For instance, the string “stream” has to be displayed as follows:
// S
// S t
// S t r
// S t r e
// S t r e a
// S t r e a m


public class Pattern{
    public static void main(String[] args){
           String s;
           s="Stream";
           int l;
           l = s.length();
           for(int i=0; i<l;i++)
           {

               for(int j=0;j<i;j++)
               {
                   System.out.printf("%c ",s.charAt(j));
               }
               System.out.printf("%c \n",s.charAt(i));
           }         
    }
}

// S 
// S t
// S t r
// S t r e
// S t r e a
// S t r e a m
