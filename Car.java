import java.util.*;
public class Car
{
    String carname;
    int price;
    double taxrate=12.5;
    public void totalprice(int price,double tax)
    {
        double total;
        tax=tax/100;
        total=price+(tax*price);
        System.out.println("the total pricee is:"+total);
    }
    public static void main(String args[])
    {
        Car c1=new Car();
        Car c2=new Car();
        c1.totalprice(1000,c1.taxrate);
        c2.totalprice(1900,c2.taxrate);
    }
}