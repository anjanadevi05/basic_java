import java.util.*;
public class prime 
{
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
        int flag=0;
        System.out.println("Enter 1 to check if the entered number is prime\nEnter 2 to check if the entered numbers are prime triplets\nEnter 3 to check if the entered number is circular prime");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            flag=1;
            System.out.println("Enter a number");
            int n=sc.nextInt();
            if(isprime(n))
            System.out.println("The entered number is prime");
            else
            System.out.println("The entered number is not prime");
            break;
            case 2:
            System.out.println("Enter 3 numbers to check for prime triplets");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(((y==x+2) && (z==x+6))||((y==x+4) && (z==x+6)))
            {
                if(isprime(x) && isprime(y) && isprime(z))
                System.out.println("It is a prime triplet");
            }
            break;
            case 3:
            System.out.println("Enter a number to check if it is a circular prime");
            int num=sc.nextInt();
            flag=1;
            if(!isprime(num))
            flag=0;
            int temp=num,digit=0;
            while(temp>0)
            {
                digit++;
                temp=temp/10;
            }
            if(flag==1)
            {
                int divisor=(int)(Math.pow(10,digit-1));
                temp=num;
                for(int i=1;i<digit;i++)
                {
                    int n1=temp/divisor;
                    int n2=temp%divisor;
                    temp=n2*10+n1;
                    if(!isprime(temp))
                    {
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1)
            System.out.println("The entered number is circular prime");
            else
            System.out.println("The entered number is not circular prime");
           
            break;
            default:
            System.out.println("Invalid choice!!");
            break;

        }
        
    }

}

