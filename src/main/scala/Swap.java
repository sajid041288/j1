import java.util.Scanner;

public class Swap
{
    public static void main(String[] args) {

        int a ,b ;
        Scanner sc =new Scanner(System.in);

        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        a =a+b;
        b = a-b;
        a=a-b;
        System.out.println("Sa " +a);
        System.out.println("Sb " +b);

    }
}
