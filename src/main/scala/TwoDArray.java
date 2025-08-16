import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][]= new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array element");

        int i;
        int j;


        for (i =0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }

        }
        for ( i =0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();

        }

    }

}
