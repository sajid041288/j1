import java.util.Scanner;

public class StringBuilderReplace {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s");
        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.replace(4,9,"Khan"));
    }
}
