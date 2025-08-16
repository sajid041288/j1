import java.util.Scanner;

public class TwoDASUM {

    public static void main(String[] args) {
        int a[][]= new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array element");

        int i= 0;
        int j= 0;
        int SUME=0;
        int SUMO =0;

        for (i =0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }

        }
        for ( i =0;i<3;i++) {
            for (j = 0; j < 3; j++) {

                if (a[i][j] % 2 == 0) {
                    SUME = SUME + a[i][j];
                } else {
                    SUMO = SUMO + a[i][j];

                }
            }
        }
        System.out.println("Even Sum" +SUME);
        System.out.println("ODD Sum" +SUMO);
    }

}
