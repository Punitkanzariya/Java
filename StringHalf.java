// java program for find length of string and print second half of string

public class StringHalf{
    public static void main(String[] args){
        String str="Punit kanzariya";
        int length = str.length();
        int i = length / 2;
        System.out.println("Main string:"+str);
        System.out.println("Length of string:"+length);
        System.out.println("Second Half of string: "+str.substring(i));
    }
}