import org.apache.spark.sql.connector.read.Scan;

import java.util.Scanner;

public class StingBuilderReverse {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s");
        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        //System.out.println(sb.reverse());
        System.out.println(sb.replace(0,3,"abc"));
    }
}

