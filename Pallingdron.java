// check for given string or number Pallingdron or not
import java.util.*
;
public class Pallingdron{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1="", str2="";
        System.out.println("Enter your String or Number:");
        str1=in.nextLine().toLowerCase();

        int strLength = str1.length();
        for (int i = (strLength - 1); i >=0; --i) {
          str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println(str1+" String or number is Pallingdron");
        }
        else{
            System.out.println(str1+" String or number is not Pallingdron");
        }
    }
}