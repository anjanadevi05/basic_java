import java.io.*;
import java.util.*;

class min_max {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    List<Integer>rec=new ArrayList<>(Arrays.asList(0,0));
    int m=0,n=0;
    int min=scores.get(0),max=scores.get(0);
    for(int i=1;i<scores.size();i++)
    {
        if(scores.get(i)>max)
        {
            max=scores.get(i);
        rec.set(0,++m);
        
        }
        else if(scores.get(i)<min)
        {
            min=scores.get(i);
            rec.set(1,++n);
            
        }
        
    }
    return rec;

    }
    public static void main(String[] args) throws IOException {

        List<Integer> scores = new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));

        List<Integer> result = breakingRecords(scores);
        System.out.println(result);
    }
}
