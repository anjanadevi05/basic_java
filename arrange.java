public class arrange
{
    static int arr[]=new int[]{1,2,9,3,4,5,6,7,8};
    static int n=arr.length;
    public static int max(int arr[],int size)
    {
        int index=-1,i,max=0;
        for(i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        i=index;
        if(index==size-1)
        {
            n=n-1;
        }
        while(i<size-1)
        {
            arr[i]=arr[i+1];
            i++;
            n=n-1;
        }
        return max; 
    }
    public static int min(int arr[],int size)
    {
        int index=-1,i,min=99999;
        for(i=0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                index=i;
            }
        }
        i=index;
        if(index==size-1)
        {
            n=n-1;
        }
        while(i<size)
        {
            arr[i]=arr[i+1];
            i++;
            n=n-1;
        }
        
        return min; 
    }
    public static void main(String args[])
    {
        int res[]=new int[100];
        int i,c=0,temp,x;
        x=n;
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                temp=max(arr,x);
                res[c]=temp;
                c++;
            }
            else
            {
                temp=min(arr,x);
                res[c]=temp;
                c++;
            }
            x=x-1;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(" "+res[i]);
        }
    }
}
