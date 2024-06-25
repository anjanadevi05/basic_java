import java.util.*;
public class evilnum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if the number is a evil number");
        int n = sc.nextInt();
        int count=0;
        int binary[]=new int[100];
        int i=0;
        while(n>0)
        {
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        int bin_num[]=new int[i+1];
        for(i=0;i<bin_num.length;i++)
        {
            bin_num[i]=binary[bin_num.length-1-i];
        }
        for(i=0;i<bin_num.length;i++)
        {
            if(bin_num[i]==1)
            count++;
        }
        if(count%2==0)
        System.out.println("The number is a evil number");
        else
        System.out.println("The number is not a evil number");
    }

}
