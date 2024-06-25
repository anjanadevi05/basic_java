
import java.util.*;

public class Solution {

    public static int[] maximum_length(int N, String S, int Q, int[] X, char[] Y) {
        int[] result = new int[Q];
        char[] chars = S.toCharArray();
        // Preprocess to find maxConsecutive
        int[] maxConsecutive = new int[N];
        maxConsecutive[0] = 1;
        for (int i = 1; i < N; i++) {
            if (chars[i] == chars[i - 1]) {
                maxConsecutive[i] = maxConsecutive[i - 1] + 1;
            } else {
                maxConsecutive[i] = 1;
            }
        }
        
        // Process each query
        for (int i = 0; i < Q; i++) {
            if (X[i] < 1 || X[i] > N) 
            {
                System.out.println("Invalid index: " + X[i]);
                continue;
            }
            chars[X[i] - 1] = Y[i];
            result[i] = maxConsecutive[X[i] - 1];
        }
        
        return result;
    }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Length of the string S
            String S = scanner.next(); // String S
            int Q = scanner.nextInt(); // Number of queries
            
            int[] X = new int[Q];
            char[] Y = new char[Q];
            
            // Input queries
            for (int i = 0; i < Q; i++) {
                X[i] = scanner.nextInt();
            }
            for (int i = 0; i < Q; i++) {
                Y[i] = scanner.next().charAt(0);
            }
            
            // Create an instance of Solution to call the non-static method
            Solution solution = new Solution();
            // Calculate the maximum lengths after each query
            int[] lengths = solution.maximum_length(N, S, Q, X, Y);
            // Print the maximum lengths
            for (int length : lengths) {
                System.out.print(length + " ");
            }
            System.out.println();
        }
    }
}