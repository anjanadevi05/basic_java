import java.util.*;
public class Arrmatrix
{
    int row,col,mat[][];
    Scanner in=new Scanner(System.in);
    Arrmatrix()
    {
        System.out.println("with default constructor:");
        System.out.println("enter the number of rows and column");
        row=in.nextInt();
        col=in.nextInt();
        mat=new int[row][col];
    }
    Arrmatrix(int a,int b)
    {
        System.out.println("with parametric constructor:");
        row=a;
        col=b;
        mat=new int[a][b];
    }
    void get()
    {
        int i,j;
        System.out.println("Enter the elements: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
    }
    void display()
    {
        int i,j;
        System.out.println("the elements are: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
       Arrmatrix m1=new Arrmatrix();
       m1.get();
       m1.display();
       Arrmatrix m2=new Arrmatrix(2,3);
       m2.get();
       m2.display();
       System.out.println("with copy constructor:");
       Arrmatrix m3;
       m3=m1;//copy constructor
       m3.display();
    }
}