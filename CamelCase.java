import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine())
        {
        String str=in.nextLine();
        String res="";
        String[] arr=str.split(";");
        if(arr[0].equalsIgnoreCase("S"))
        {
            for(int i=0;i<arr[2].length();i++)
            {
                char ch=arr[2].charAt(i);
                if(Character.isUpperCase(ch) && i>=1)
                res=res+" "+ch;
                else if((ch=='(' ||ch==')') &&arr[1].equalsIgnoreCase("M"))
                continue;
                else
                res=res+ch;
            }
             res=res.toLowerCase();
        }
        if(arr[0].equalsIgnoreCase("C"))
        {
            for(int i=0;i<arr[2].length();i++)
            {
                char ch=arr[2].charAt(i);
                if(ch==' ')
                continue;
                else if(i>=1 && arr[2].charAt(i-1)==' ')
                res=res+(Character.toUpperCase(ch));
                else
                res=res+ch;
            }
            if(arr[1].equalsIgnoreCase("M"))
            res=res+"()";
            if(arr[1].equalsIgnoreCase("C"))
            res=Character.toUpperCase(res.charAt(0))+res.substring(1);
        }
        System.out.println(res);
        }
    }

}
