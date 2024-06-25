import java.util.*;
public class SortWord {
    String txt;
    int len;
    public SortWord() 
    {
        txt="";
        len=0;
    }
    public void readTxt()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word in Lowercase");
        txt=in.next();
        while(!(txt.equals(txt.toLowerCase())))
        {
            System.out.println("Not in Uppercase!!Enter again");
            txt=in.next();
        }

    }
    public void sortTxt()
    {
        Character str[]=new Character[txt.length()];
        for(int i=0;i<txt.length();i++ )
        {
            str[i]=txt.charAt(i);

        }
        char temp;
        int flag=0;
        for(int i=0;i<txt.length()-1;i++)
        {
            flag=0;
            for(int j=0;j<txt.length()-i-1;j++)
            {
                if(str[j]>str[j+1])
                {
                    temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            break;
        }
        txt="";
        for(int i=0;i<str.length;i++)
        {
           txt+=str[i];
        }
    }
    public void changeTxt()
    {
        String temp="";
        for(int i=0;i<txt.length();i++)
        {
            if((txt.charAt(i)=='a') || (txt.charAt(i)=='e') || (txt.charAt(i)=='i') || (txt.charAt(i)=='o') || (txt.charAt(i)=='u'))
            {
                String vowel="";
                vowel=txt.charAt(i)+"";
                vowel=vowel.toUpperCase();
                temp=temp+vowel;
            }
            else
            {
                temp=temp+txt.charAt(i);
            }
        }
        txt=temp;
    }
    public void display()
    {
        System.out.println("Changed String: "+txt);
    }
    public static void main(String[] args) {
        SortWord s=new SortWord();
        s.readTxt();
        s.sortTxt();
        s.changeTxt();
        s.display();
        
    }

}
