import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number from 1 to 10");
        int number = sc.nextInt();

        for (number = 1; number<= 10; number++) {
            if (number % 2 == 0) {
                System.out.println("even number " +number);
            }

            }
    }
}
