import java.util.*;
public class composite {
    public static void iscomposite(int num)
    {
        int flag=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        System.out.println("The number is a composite number");
        else
        System.out.println("The number is not composite number");

    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check if it is a composite number");
        int n=in.nextInt();
        iscomposite(n);
    }

}
