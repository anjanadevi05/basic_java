import java.util.*;
public class Arrlist
 {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    int rows, cols;
    Arrlist() 
    {
        rows = 2;
        cols = 3;
        System.out.println("default constructor:(M2)");
        get(rows, cols);
    }

    Arrlist(int a, int b)
    {
        rows = a;
        cols = b;
        System.out.println("parametric constructor:(M1)");
        get(rows, cols);
    }

    void get(int rows, int cols)
    {
        matrix = new ArrayList<>(rows);
        System.out.println("Enter the elements:");
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < rows; i++)
        {
            ArrayList<Integer> row = new ArrayList<>(cols);
            for (int j = 0; j < cols; j++) 
            {
                int element = sc.nextInt();
                row.add(element);
            }
            matrix.add(row);
        }
    }

    void display() 
    {
        System.out.println("The matrix elements are:");
        for (int i = 0; i < matrix.size(); i++) 
        {
            ArrayList<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); j++)
            {
                System.out.print(row.get(j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();
        Arrlist m1 = new Arrlist(rows, cols);
        System.out.println("Matrix m1:");
        m1.display();
        Arrlist m2 = new Arrlist();
        System.out.println("Matrix m2:");
        m2.display();
    }
}
