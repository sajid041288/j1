import java.util.Scanner;

public class TRY_CATCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b =sc.nextInt();

        try {
            int c = 10 / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(" Arithmatic exception occurs");
        }
    }

}
