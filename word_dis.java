import java.util.*;
public class word_dis
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String dis[]=str.split(" ");
        String w1=in.next();
        String w2=in.next();
        int distance=99999,wi1=-1,wi2=-1;
        for(int i=0;i<dis.length;i++)
        {
            if(dis[i].equals(w1))
            wi1=i;
            if(dis[i].equals(w2))
            wi2=i;
            if(wi1!=-1 && wi2!=-1)
            distance=Math.min(distance,Math.abs(wi1-wi2));
        }
        if(distance==0)
        System.out.println(distance+1);
        else
        System.out.println(distance);
    }
}