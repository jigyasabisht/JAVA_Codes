import java.util.*;
class Sumof2matrix
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        int br[][] = new int[n][m];
        System.out.println("Elements of the given matrices A is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of the given matrices B is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                br[i][j] = sc.nextInt();
            }
        }
        int sum[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 sum[i][j] = ar[i][j]+br[i][j];
            }
        }
        System.out.println("Sum of the given matrices is: ");
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }

    }
}
