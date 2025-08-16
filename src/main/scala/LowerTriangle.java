import java.util.Scanner;

public class LowerTriangle {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array a");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("triangle 0 Array:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (j == 0 && i>0 || j==1 && i>1 )
                {
                    a[i][j] = 0;
                    System.out.print(a[i][j]+"\t");
                }
                else
                {

                    System.out.print(a[i][j]+"\t");
                }


            }
            System.out.println();

        }

    }
}