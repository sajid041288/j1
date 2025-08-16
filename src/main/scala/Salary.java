import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        int hra, da, bsal;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bsal");
        bsal = sc.nextInt();
        double gross;
        if (bsal <= 10000) {
            gross = (bsal + bsal * 0.2 * 0.8);
            System.out.println("gross " + gross);
        }
        if (bsal >10000 && bsal  <= 20000) {
            gross = (bsal + bsal * 0.25 * 0.9);
            System.out.println("gross1 " + gross);
        }
        if(bsal>20000) {
            gross = (bsal + bsal * 0.30 * 0.95);
                System.out.println("gross2 " + gross);

        }
    }
}