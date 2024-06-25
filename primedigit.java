import java.util.*;
public class primedigit 
{
    public static int isprime(int n)
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
        return 1;
        else
        return 0;
    }
    public static int sod(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int sum;
        for(int i=0;i<n;i++)
        {
            sum=sod(arr[i]);
            if(isprime(sum)==1)
            {
                System.out.print(arr[i]+" , ");
            }

        }
        

    }

}
