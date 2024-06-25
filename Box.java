import java.util.*;
public class Box
{
    int length;
    int breath;
    int area;
    Box(int l,int w)
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
