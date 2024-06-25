import java.util.*;
import java.lang.*;
public class Complex
{
    int a,b;
    Complex()
    {
       a=15;
       b=2;
    }
    Complex(int m,int n)
    {
        a=m;
        b=n;
    }
    Complex(Complex m)
{
a=m.a;
b=m.b;
}
protected void finalize() throws Throwable
{
   System.out.println("object destroyed!!");
}
public static void main(String args[])throws Throwable
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        Complex c1=new Complex();
        System.out.println("the values in object c1-"+c1.a+"+i"+c1.b);
         System.out.println("enter two values");
        x=in.nextInt();
        y=in.nextInt();
        Complex c2=new Complex(x,y);
        System.out.println("the values in object c2-"+c2.a+"+i"+c2.b);
        Complex c3=new Complex(c2);
        System.out.println("the values in object c3-"+c3.a+"+i"+c3.b);
        c1.finalize();
        System.gc();
        System.out.println("the values in object c3-"+c1.a+"+i"+c1.b);
}
}