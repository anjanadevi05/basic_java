import java.util.*;
public class vowels 
{
    public static void vowel(String txt)
    {
        int count[]=new int[5];
        for(int i=0;i<5;i++)
        count[i]=0;
        txt=txt.toUpperCase();
        for(int i=0;i<txt.length();i++)
        {
            if((txt.charAt(i)=='A') || (txt.charAt(i)=='E') || (txt.charAt(i)=='I') || (txt.charAt(i)=='O') || (txt.charAt(i)=='U'))
            {
                System.out.print(txt.charAt(i)+",");
                if(txt.charAt(i)=='A')
                count[0]++;
                if(txt.charAt(i)=='E')
                count[1]++;
                if(txt.charAt(i)=='I')
                count[2]++;
                if(txt.charAt(i)=='O')
                count[3]++;
                if(txt.charAt(i)=='U')
                count[4]++;
            }
        }
        int max_value=0,max=0;
        for(int i=0;i<5;i++)
        {
            if(count[i]>max_value)
            {
                max_value=count[i];
                max=i;

            }
        }
        if(max==0)
        System.out.println("The predominent vowel : a");
        if(max==1)
        System.out.println("The predominent vowel : e");
        if(max==2)
        System.out.println("The predominent vowel : i");
        if(max==3)
        System.out.println("The predominent vowel : o");
        if(max==4)
        System.out.println("The predominent vowel : u");


    }
    public static void main(String[] args) 
    {
        System.out.println("Enter a Sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        vowel(str);
    }


}
