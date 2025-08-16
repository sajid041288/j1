import org.apache.parquet.io.DelegatingSeekableInputStream;

import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a, b, c ");
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if (a > 15) {

            if (b == 30)
            {
                System.out.println("i am not good");
            }

            System.out.println("i am good");
        }
        else if(c >50)
        {
            System.out.println("this is ok");
        }
        else {
            System.out.println("finally i am at home");
        }
    }
}