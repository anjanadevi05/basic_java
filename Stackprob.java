import java.util.*;
public class Stackprob<T>
{
    Stack<T> st=new Stack<>();
    public void display(Stackprob<? extends T>ob)
    {
        for(T elements:ob.st)
        {
            System.out.print(elements+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stackprob<Integer> instack= new Stackprob<>();
        Stackprob<Character> charstack= new Stackprob<>();
        Stackprob<Float> floatstack= new Stackprob<>();
        char ch,temp;
        int choice,x;
        float y;
        do
        {
            System.out.println("Enter a choice 1.int,2.char,3.float");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    do
                    {
                       System.out.println("Enter a choice 1.push,2.pop");
                       choice=in.nextInt();
                       if(choice==1)
                       {
                           System.out.println("Enter a element to push");
                           x=in.nextInt();
                           instack.st.push(x);
                       }
                       if(choice==2)
                       {
                           instack.st.pop();
                       }
                       System.out.println("want to enter another choice?");
                       ch=in.next().charAt(0);
                    }
                    while(ch!='n');
                    break;
                case 2:
                    do
                    {
                       System.out.println("Enter a choice 1.push,2.pop");
                       choice=in.nextInt();
                       if(choice==1)
                       {
                           System.out.println("Enter a element to push");
                           temp=in.next().charAt(0);
                           charstack.st.push(temp);
                       }
                       if(choice==2)
                       {
                           charstack.st.pop();
                       }
                       System.out.println("want to enter another choice?");
                       ch=in.next().charAt(0);
                    }
                    while(ch!='n');
                    break;
                case 3:
                    do
                    {
                       System.out.println("Enter a choice 1.push,2.pop");
                       choice=in.nextInt();
                       if(choice==1)
                       {
                           System.out.println("Enter a element to push");
                           y=in.nextFloat();
                           floatstack.st.push(y);
                       }
                       if(choice==2)
                       {
                           floatstack.st.pop();
                       }
                       System.out.println("want to enter another choice?");
                       ch=in.next().charAt(0);
                    }
                    while(ch!='n');
                    break;
            }
            System.out.println("want to enter another choice?");
            ch=in.next().charAt(0);
        }
        while(ch!='n');
    }
}