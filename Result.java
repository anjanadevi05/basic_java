import java.util.*;
import java.io.*;
class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String arr[]=s.split(":");
    String temp="";
    int time[]=new int[arr.length];
    for(int i=0;i<arr.length-1;i++)
    {
        time[i]=Integer.valueOf(arr[i]);
    }
    char t=arr[arr.length-1].charAt(2);
    arr[arr.length-1]=arr[arr.length-1].substring(0,2);
    if(t=='P'||t=='p')
    {
        if(time[0]==12)
        return s.substring(0,s.length()-2);
        else
        {
            time[0]=time[0]+12;
            temp=temp+time[0]+":";
        for(int i=1;i<arr.length-1;i++)
        temp=temp+arr[i]+":";
        temp=temp+arr[arr.length-1];
        return temp;
        }
        
    }
    else{
        if(time[0]==12)
        {
            time[0]=time[0]-12;
            temp=temp+time[0]+"0:";
        for(int i=1;i<arr.length-1;i++)
        temp=temp+arr[i]+":";
        temp=temp+arr[arr.length-1];
        return temp;
        }
        else
        return s.substring(0,s.length()-2);
        
    }
    }


    public static void main(String[] args) throws IOException {

        String s = "12:05:39AM";

        String result = timeConversion(s);
        System.out.println(result);
    }
}

