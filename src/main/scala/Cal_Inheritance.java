import java.util.Scanner;

class Calculator1 {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        if (b == 0) {
            System.out.println("invalid infinity case ");
        }
            return a / b;
        }
}
class AdvanceCal extends Calculator1
{
    int module(int a,int b)
    {
        return a%b;
    }

}
public class Cal_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        AdvanceCal c = new AdvanceCal();
        System.out.println("add " + c.add(a, b));
        System.out.println("sub " + c.sub(a, b));
        System.out.println("mul " + c.mul(a, b));
        System.out.println("div " + c.div(a, b));
        System.out.println("mod " + c.module(a, b));
    }
}