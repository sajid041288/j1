import java.util.Scanner;

public class Calci {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("cant div by 0");
            return 0;
        }

        return (double)a / b;
    }

    public static void main(String[] args) {
        Calci ci= new Calci();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = sc.nextInt();
        System.out.println("enter n2");
        int n2 = sc.nextInt();
        System.out.println("enter the operator +,-,*,/");
 char operator = sc.next().charAt(0);
 switch(operator)
        {
            case '+':
                System.out.println("result:" +ci.add(n1,n2));
                break;
            case '-':
                System.out.println("result:" +ci.sub(n1,n2));
                break;
            case '*':
                System.out.println("result:" +ci.mul(n1,n2));
                break;
            case '/':
                System.out.println("result:" +ci.div(n1,n2));
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
