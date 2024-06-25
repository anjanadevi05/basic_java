import java.util.*;
class Overload{
    static void merge(String str1,String str2)
    {
        String res;
        res=str1.concat(str2);
        System.out.println("the merged string is:"+res);  
     }
     public void merge(String str)
    {
        String res,str1;
        System.out.println("enter a string to merge with "+str);
        Scanner in =new Scanner(System.in);
        str1=in.nextLine();
        res=str.concat(str1);
        System.out.println("the merged string is:"+res);  
     }
     static void merge()
    {
        Scanner in =new Scanner(System.in);
        String res,str1,str2;
        System.out.println("enter two strings to merge");
        str1=in.nextLine();
        str2=in.nextLine();
        res=str1.concat(str2);
        System.out.println("the merged string is:"+res);  
     }
}
public class hello
{
    public static void main(String args[])
    {
        Overload obj=new Overload();
        Scanner in= new Scanner(System.in);
        String str=new String();
        obj.merge("Hello","World");
        System.out.println("Enter a string:");
        str=in.nextLine();
        obj.merge(str);
        obj.merge();

    }
   
}