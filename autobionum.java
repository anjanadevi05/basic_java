import java.util.*;
public class autobionum {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num=sc.nextInt();
        int temp=num,flag=1;
        String str=String.valueOf(temp);
        int digit[]=new int[str.length()];
        for(int i=digit.length-1;i>=0;i--)
        {
            digit[i]=num%10;
            num=num/10;
        }
        for(int i=0;i<digit.length;i++)
        {
            int count=0;
            for(int j=0;j<digit.length;j++)
            {
                if(i==digit[j])
                {
                    count++;
                }
            }
            if(count!=digit[i])
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        System.out.println("The number is an autobiographical number");
        else
        System.out.println("The number is not an autobiographical number");
    }

}
