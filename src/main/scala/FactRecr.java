import java.util.Scanner;

import static org.apache.curator.shaded.com.google.common.math.DoubleMath.factorial;

public class FactRecr {
    public static int factorial(int n)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");
//         n = sc.nextInt();

            if (n == 0 || n == 1)
                return 1;

            else

                return n * factorial(n - 1);
        }
            public static void main (String[] args) {
            int num =5;

            System.out.println("fact is" + factorial(num));

    }
}