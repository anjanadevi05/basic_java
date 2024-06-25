import java.util.*;
public class piglatin {
    String txt;
    int len;
    public piglatin() 
    {
        txt="";
        len=0;
    }
    public void readstring()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word in Uppercase");
        txt=in.next();
        while(!(txt.equals(txt.toUpperCase())))
        {
            System.out.println("Not in Uppercase!!Enter again");
            txt=in.next();
        }
    }
    public void convert()
    {
        System.out.println("Original word:"+txt);
        String piglatin_word="";
        for(int i=txt.length()-1;i>=0;i--)
        {
            piglatin_word=piglatin_word+txt.charAt(i);
        }
        piglatin_word=piglatin_word+"AY";
        System.out.println("Piglatin word:"+piglatin_word);

    }
    public void consonant()
    {
        int count=0;
        for(int i=0;i<txt.length();i++)
        {
            if((txt.charAt(i)!='A') && (txt.charAt(i)!='E') && (txt.charAt(i)!='I') && (txt.charAt(i)!='O') && (txt.charAt(i)!='U'))
            {
                count++;
            }
        }
        System.out.println("Number of consonants in "+txt+" are: "+count);

    }
    public static void main(String[] args) 
    {
        piglatin word=new piglatin();
        word.readstring();
        word.convert();
        word.consonant();
    }

}
