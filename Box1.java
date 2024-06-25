import java.util.*;
public class Box1
{
    int length;
    int breath;
    int area;
    Box1(int l,int w)
    {
        length=l;
        breath=w;
    }
    void area()
    {
        area=length*breath;
        System.out.println("the area is:"+area);
    }
}