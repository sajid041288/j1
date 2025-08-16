import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1");
        System.out.println("Enter s2");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        String s3=s1.toUpperCase();
        String s4 =s2.toUpperCase();
        if(s3.equals(s4))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
