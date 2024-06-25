import java.util.*;
public class merge2array {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,3,5,7,8,9};
    int arr1[]={2,4,6,8};
    Queue<Integer>finalarr=new LinkedList<>();
    for(int i=0;i<arr1.length;i++)
    {
        finalarr.add(arr1[i]);

    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<finalarr.peek())
        {
            finalarr.add(arr[i]);
        }
        else
        {
            finalarr.add(finalarr.remove());
        }
    }
    /*while(!finalarr.isEmpty())
    {
        finalarr.add(finalarr.remove());
    }*/
    System.out.println(finalarr);

}

}
