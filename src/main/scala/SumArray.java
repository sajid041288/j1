import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
            System.out.println("enter b array ");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                        System.out.print(c[i][j]+ "\t");
                    }

                }

            }
        }

