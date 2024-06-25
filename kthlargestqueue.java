import java.util.*;

public class kthlargestqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int count=0,value;
        int[] arr = {15,23,25,31,99,82,45};
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=-arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            pr.add(arr[i]);
        }
         //System.out.println(pr);
         while (!pr.isEmpty()) {
            count++;
           value=pr.poll();
           if(count==k)
           {
            value=-(value);
             System.out.println(value);
            }
           }
        }

}


