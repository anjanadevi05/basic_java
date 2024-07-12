import java.util.*;
public class diagonal_diff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rd=0,ld=0,dif;
        for(int i=0;i<arr.size();i++)
        {
                   rd=rd+arr.get(i).get(i);
                    ld=ld+arr.get(i).get(arr.size()-i- 1);
                
            
        }
            dif=(rd>ld)?(rd-ld):(ld-rd);
            return dif;
    
        }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        Scanner in=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("row "+i);
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(in.nextInt());
            }
            arr.add(row);
        }
        int difference=diagonalDifference(arr);
        System.out.println(difference);
        
    }

}
