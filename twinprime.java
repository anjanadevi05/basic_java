import java.util.*;
public class twinprime {
    public static boolean isprime(int n)
    {
        int flag=1;
         if(n==2)
        flag=1;
        if(n==1)
        flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The twin prime pairs between "+m+" and "+n);
        for(int i=m;i<=n;i++)
        {
            if(isprime(i) && isprime(i+2) && (i+2)<=n)
            {
                System.out.print("("+i+","+(i+2)+"),");
            }

        }
    }

}
