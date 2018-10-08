import java.util.*;
class inversematrix
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n=SC.nextInt();
        System.out.println("Enter the no. of columns");
        int m=SC.nextInt();
        
        int a[][]=new int[n][m];
        int b[][]=new int[m][n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                a[i][j]=SC.nextInt();
            }
        }
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(b[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
        