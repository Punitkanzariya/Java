// Write a java program to find out the volume of a rectangular box and volume of a cube using the concept of constructor overloading.

class volume{
    int h;
    int w;
    int l;
    int s;
    public volume(int l,int w,int h){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    public volume(int s){
        this.s=s;
    }
    public void volumeofrectangle(){
        System.out.println("Volume of rectangle:"+l*w*h);
    }
    public void volumeofCirlce(){
        System.out.println("Volume of circle:"+s*s*s);
    }
}
public class Const{
    public static void main(String[] args){
        volume v1=new volume(3,4,5);
        v1.volumeofrectangle();
        volume v2=new volume(5);
        v2.volumeofCirlce();
    }
}