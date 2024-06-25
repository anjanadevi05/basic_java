import java.util.*;
public class nextlargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int res[]=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            if(stack.isEmpty())
            {
                res[i]=-1;
                stack.push(arr[i]);
            }
            if(arr[i]<=stack.peek())
            {
                res[i]=stack.peek();
                stack.push(arr[i]);
            }
            else if(arr[i]>stack.peek())
            {
                while(arr[i]>=stack.peek() && !stack.isEmpty())
                stack.pop();
            }
            res[i]=
            stack.push(arr[i]);
        }
        System.out.println(stack);
    }
    
}
