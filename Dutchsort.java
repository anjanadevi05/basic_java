public class Dutchsort {
    public static void main(String args[])
    {
        int arr[]={0,1,1,2,0,1,2};
        int n=arr.length;
        int low,mid,high;
        low=0;
        mid=0;
        high=n-1;
        while(mid<=high)
        {
                if(arr[mid]==0)
                {
                   int temp =arr[mid];
                   arr[mid]=arr[low];
                   arr[low]=temp;
                    low++;
                    mid++;
                }
                else if(arr[mid]==1)
                {
                    mid++;
                }
                else if(arr[mid]==2)
                {
                   int temp =arr[mid];
                   arr[mid]=arr[high];
                   arr[high]=temp;
                    high--;
                }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"\t");
        }
    }
    
}
