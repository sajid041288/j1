import java.util.Scanner;

public class StringBuilder1 {


    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s");

        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

    }
}