import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        {
            int n;
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the number");
            n = sc.nextInt();
            if(n%5==0 && n%11==0)
            {
                System.out.println("number n is divisible by 5 & 11");
            }
            else {
                System.out.println(" number n not divisible by 5 & 11");
            }
        }
    }
}
