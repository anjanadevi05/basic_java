import java.util.*;
public class Shoppinglist
{
    String product;
    int price;
    int prodcode;
    Shoppinglist(String p,int r,int c)
    {
        product=p;
        price=r;
        prodcode=c;
    }
    void display(ArrayList<Shoppinglist>list)
    {
        int i;
        for(i=0;i<list.size();i++)
        {
            Shoppinglist d=list.get(i);
            System.out.print(d.product+" "+d.price+" "+d.prodcode);
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        ArrayList<Shoppinglist>list=new ArrayList();
        Scanner in=new Scanner(System.in);
        int choice,rate,code,i;
        int total=0;
        String name;
        char ch;
        do
        {
        System.out.println("enter 1 to add item to sl,2 to remove,3 to generate bill");
        choice=in.nextInt();
        in.nextLine();
        switch(choice)
        {
            case 1:
                System.out.println("enter name of product");
                name=in.nextLine();
                System.out.println("enter price of product");
                rate=in.nextInt();
                System.out.println("enter the product code");
                code=in.nextInt();
                Shoppinglist item=new Shoppinglist(name,rate,code);
                list.add(item);
                break;
            case 2:
                System.out.println("enter name of product");
                name=in.nextLine();
                System.out.println("enter price of product");
                rate=in.nextInt();
                System.out.println("enter the product code");
                code=in.nextInt();
                for(i=0;i<list.size();i++)
                {
                    Shoppinglist obj=list.get(i);
                    if(obj.product.equals(name) && obj.prodcode==code)
                    {
                        list.remove(i);
                        System.out.println("removed"+name);
                        break;
                    }
                }
                break;
            case 3:
                for(i=0;i<list.size();i++)
                {
                    Shoppinglist obj=list.get(i);
                    total=total+obj.price;
                }
                System.out.println("total:"+total);
                new Shoppinglist("",0,0).display(list);
                break;
            default:
                System.out.println("invalid choice?");
        }
        System.out.println("want to enter another choice?");
        ch=in.next().charAt(0);
      }
      while(ch=='y');
    }
}