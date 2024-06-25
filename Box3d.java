import java.util.*;
public class Box3d extends Box
{
    int length;
    int breath;
    int height;
    int volume;
    Box3d(int l,int w,int h)
    {
        super(l,w);
        height=h;
    }
    void volume()
    {
        volume=length*breath*height;
        System.out.println("the volume is:"+volume);
    }
    public static void main(String args[])
    {
        Box3d b=new Box3d(5,10,15);
        b.area();
        b.volume();
    }
}