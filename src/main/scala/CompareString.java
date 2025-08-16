import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {

            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter s");
            String s1 = "seed";
            String s2 = "seed";
            String s3 ="Seed1";
       // System.out.println(s1==s3);
        //System.out.println(s1.equals(s2));
       // System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
