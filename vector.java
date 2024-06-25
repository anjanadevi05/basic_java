import java.util*;
public class Vector
{
    ArrayList<Integer> arrlist;
    Vector()
    {
        arrlist=new ArrayList<>();
        arrlist.add(9);
        arrlist.add(8);
        arrlist.add(7);
        arrlist.add(6);
        arrlist.add(5);
    }
    Vector(Vector ob)
    {
        this.arrlist=ob.arrlist
    }
    Vector(ArrayList<Integer> list)
    {
          this.arrlist=list;
    }
    void print()
    {
        System.out.println(list+"/t");
    }
    public static void main(String args[])
    {
        Vector v=new Vector();
        v.print();
        Vector v1=new Vector(v);
        v1.print();
        int arr[]=new int{1,2,3,4,5};
        List<Integer> list=Arrays.asList(a);
        Vector v2=new Vector(list);

    }
}