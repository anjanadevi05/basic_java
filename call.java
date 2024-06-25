import java.util.*;
public class call
{
    int add()
    {
        int sum;
        sum=9+8;
        return sum;
    }
    public static void main(String[] args)
    {
        call a=new call();
        Scanner sc=new Scanner(System.in);
        System.out.println("the sum is"+a.add());
    }
}