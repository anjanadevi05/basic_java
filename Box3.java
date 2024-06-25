import java.util.*;
public class Box3 extends Box1
{
    int height;
    int volume;
    Box3(int l,int w,int h)
    {
        super(l,w);
        height=h;
    }
    void volume()
    {
        volume=length*breath*height;
        int sum=height;
        sum=length;
        System.out.println("the volume is:"+volume);
    }
    public static void main(String args[])
    {
        Box3 b=new Box3(5,10,15);
        b.area();
        b.volume();
    }
}