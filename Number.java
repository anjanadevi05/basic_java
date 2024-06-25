import java.util.*;
public class Number {
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
        System.out.println("Enter a number");
        int flag=0;
        int n=sc.nextInt();
        System.out.println("Enter 1 to check if the entered number is Smith number\nEnter 2 to check if the entered number is keith number\nEnter 3 to check if the entered number is triangular number");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            int temp=n;
            int sod=0,sop=0;
            if(!isprime(n))
            {
                for(int i=2;i<temp;i++)
            {
                while(temp%i==0) 
                {
                    System.out.println(i);
                    int pf=i;
                    while(pf>0)
                    {
                        sop=sop+(pf%10);
                        pf=pf/10;
                    } 
                    temp=temp/i;   
                }        
            }
            if(temp>2)
            {
                int pf=temp;
                while(pf>0)
                {
                    sop=sop+(pf%10);
                    pf=pf/10;
                } 
            }
            temp=n;
            while(temp>0)
            {
                int digit=temp%10;
                sod=sod+digit;
                temp=temp/10;
            }
            if(sod==sop)
            {
                System.out.println("The entered number is Smith number");
            }
            else
            {
                System.out.println("The entered number is not Smith number");
            }
            }
            else
            {
                System.out.println("The entered number is not Smith number");
            }
            break;
            case 2:
            int num=n;
            int len=0,sum=0;
            int digit[]=new int[100];
            int term[]=new int[100];
            while(num>0)
            {
                digit[len]=num%10;
                len++;
                num=num/10;
            }
            for(int i=0;i<len;i++)
            {
                term[i]=digit[len-1-i];
            }
            for(int i=0;i<len;i++)
            {
                System.out.println(term[i]);
            }
            while(sum<n)
            {
                sum=0;
                for(int i=0;i<len;i++)
                {
                    sum=sum+term[i];
                }
                System.out.println(sum);
                if(sum==n)
                {
                    System.out.println("The number is keith number");
                    flag=1;
                    break;
                }
                else
                {
                    for(int i=0;i<len-1;i++)
                    {
                        term[i]=term[i+1];
                    }
                    term[len-1]=sum;
                }
            }
            if(flag==0)
            System.out.println("The number is not keith number");
            break;
            case 3:
            flag=0;
            int csum=0;
            for(int i=0;i<n;i++)
            {
                csum=csum+i;
                if(csum==n)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            System.out.println("The number is a triangular number");
            else
            System.out.println("The number is not a triangular number");
            break;
            default:
            System.out.println("Invalid choice!!");
            break;

        }
        
    }

}
