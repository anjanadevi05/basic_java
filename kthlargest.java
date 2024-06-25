import java.util.*;

public class kthlargest {
    public static void main(String[] args) {
        int[] arr = {15,23,25,31,99,82,45};
        Arrays.sort(arr);
        int k,n;
        n=arr.length;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of k");
        k=in.nextInt();
        System.out.println("The kth largest is:"+arr[n-k]);


}
}
