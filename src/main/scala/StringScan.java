import java.util.Scanner;

public class StringScan {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String n");
        n = sc.nextLine();
        System.out.println(n);
        System.out.println(n.charAt(3));
    }
}

