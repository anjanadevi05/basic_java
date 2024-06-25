import java.util.*;
public class Reverse {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            stack.push(Character.toString(s.charAt(i)));
        }
        while(!stack.isEmpty())
        System.out.print(stack.pop());

    }
    
}
