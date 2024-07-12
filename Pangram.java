public class Pangram {
    public static String pangrams(String s) {
        // Write your code here
        String ans;
        s=s.toUpperCase();
        String str[]=new String[26];
        int c=0;
        int flag=0;
        for(int i=65;i<=90;i++)
        {
            str[c]=Character.toString((char)i);
            c++;
        }
        /*for (String string : str) {
            System.out.println(string);
        }*/
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(int j=0;j<26;j++)
            {
                if((Character.toString(ch)).equals(str[j]))
                {
                    str[j]="1";
                }
            }
        }
        for (String alpha : str) {
            if(alpha.equals("1"))
            {
                flag=0;
            }
            else
            {
                flag=1;
                break;
            }
            
            
        }
        if(flag==1)
        ans="not pangram";
        else
        ans="pangram";
        return ans;
    
        }
        public static void main(String[] args) {
            String s="We promptly judged antique ivory buckles for the next prize";
            System.out.println(pangrams(s));
        }

}
