import java.util.*;
public class primefactors {
    public static void factor(int n)
    {
        System.out.println("The prime factors are:");
        for(int i=2;i<n;i++)
        {
            while(n%i==0)
            {
                System.out.print(i+",");
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.print(n);
        }


    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        factor(num);
    }
}
