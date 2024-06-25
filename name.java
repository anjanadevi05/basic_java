import java.util.*;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str=sc.next();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("The reverse of the string is:"+sb.reverse());
        int freq[]=new int[str.length()];
        Character name[]=new Character[str.length()];
        for(int i=0;i<str.length();i++)
        {
            name[i]=str.charAt(i);
        }
        for(int i=0;i<str.length();i++)
        {
            freq[i]=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(name[i]==name[j] && name[i]!=' ')
                {
                    freq[i]++;
                    name[j]=' ';
                }
            }

        }
        System.out.println("Frequency of each character is:");
        for(int i=0;i<str.length();i++)
        {
            if(name[i]!=' ')
            {
                System.out.println(name[i]+"="+freq[i]);
            }
        }
        String caps=str.substring(0, 1).toUpperCase();
        caps=caps+str.substring(1, str.length());
        System.out.println("The first letter of the string is in uppercase:"+caps);
        System.out.println("After altering:");
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                System.out.print('*');
            }
            else{
                System.out.print(str.charAt(i));
            }
        }

    }

}
