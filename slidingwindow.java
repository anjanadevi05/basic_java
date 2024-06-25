import java.util.*;
public class slidingwindow
{
    public static void main(String args[])
    {
        int windowsize=2;
        int j;
        Queue<Integer> window = new LinkedList<>();
        int[] arr = {1,-2,3,-4,-5,6,7,8,-9,10};
        for(int i=0;i<arr.length;i++)
        {
            j=i+1;
            if(j-i+1==windowsize)
            {
                if(arr[i]<0)
                {
                    window.add(arr[i]);
                    System.out.println("Element is:"+arr[i]);
                }
                else if(arr[j]<0)
                {
                    window.add(arr[j]);
                    System.out.println("Element is:"+arr[j]);
                }
                else if(arr[i]<0 && arr[j]<0)
                {
                window.add(arr[i]);
                    System.out.println("Element is:"+arr[i]);
                }
                else
                {
                    System.out.println("0");
                }
            }
            if(arr[i]==window.peek())
            {
                window.remove();
            }
        }
    }
}