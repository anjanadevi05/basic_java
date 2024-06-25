import java.util.*;
public class sol
{
    public static void main(String[] args)
    {
        String f=new String();
        Scanner v=new Scanner(System.in);
        System.out.println("enter size");
        int n=v.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter strings");
            arr[i]=v.next();
        }
        System.out.println("sorted");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i=i++)
        {
            f=f.concat(arr[i]);
            
        }
        System.out.print(f);
    }
}