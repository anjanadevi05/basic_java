import java.util.*;
public class Vector1
{
    ArrayList<Integer> arrlist;
    Vector1()
    {
        arrlist=new ArrayList<>();
        arrlist.add(9);
        arrlist.add(8);
        arrlist.add(7);
        arrlist.add(6);
        arrlist.add(5);
    }
    Vector1(Vector1 ob)
    {
        this.arrlist=ob.arrlist;
    }
    Vector1(ArrayList<Integer> list)
    {
          this.arrlist=list;
    }
    void print()
    {
        System.out.print(arrlist);
    }
    public static void main(String args[])
    {
        Vector1 v=new Vector1();
        v.print();
        System.out.print(":using default constructor");
        System.out.println();
        Vector1 v1=new Vector1(v);
        v1.print();
        System.out.print(":using copy constructor");
        System.out.println();
         ArrayList<Integer> list=new ArrayList<>();
         list.add(0);
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
        /*int arr[]=new int[]{1,2,3,4,5};
        List<Integer> list=Arrays.asList(arr);*/
        Vector1 v2=new Vector1(list);
        v2.print();
        System.out.print(":using parameteric constructor");
        System.out.println();
    }
}