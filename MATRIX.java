import java.util.*;
public class Matrix
{
    int row,col;
  int[][] first = new int[row][col];
    Matrix()
    {
        Scanner sc=new Scanner(System.in);
       row=2;
        col=2;
        first=new int[row][col];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c <col; c++)
            {
              System.out.println(String.format("Enter first[%d][%d]", r, c));
             first[r][c] = sc.nextInt();
            }
        }
    }
    Matrix(int a,int b)
    {
        row=a;
        col=b;
        first=new int[row][col];
        Scanner sc=new Scanner(System.in);
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c <col; c++)
            {
    System.out.println(String.format("Enter first[%d][%d]", r, c));
    first[r][c] = sc.nextInt();
   }
        }
   }
   void display()
   {
        for (int i = 0; i <row; i++)
        {
            for (int j = 0; j <col; j++)
        {
            System.out.print(first[i][j]+" ");
        }
        System.out.println("\n");
     }
   }
public static void main(String[] args)
{
    int a,b;
    System.out.println("default:\n");
    Matrix mat=new Matrix();
    mat.display();
    Scanner in=new Scanner(System.in);
    System.out.println("enter:\n");
    a=in.nextInt();
    b=in.nextInt();
    System.out.println("with para");
    Matrix mat1=new Matrix(a,b);
    mat1.display();
}
}
