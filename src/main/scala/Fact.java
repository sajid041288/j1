import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        int fact = 1, n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            fact = fact * i;

            System.out.println("fact" + fact);
        }


    }
}