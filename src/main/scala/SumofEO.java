import java.util.Scanner;

public class SumofEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                sumEven = sumEven + i;
            }
        }
        System.out.println("EvenSum " + sumEven);

            for (int j = 0; j <= n; j++) {
                if (n % 2 != 0) {
                    sumOdd = sumOdd + j;
                    System.out.println("EvenSum " + sumOdd);
                }
            }

        }
    }