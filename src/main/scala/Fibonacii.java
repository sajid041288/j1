import java.util.Scanner;

class Fibo1
{
    void series1 ()
    {
        System.out.println("you are in fibo 1 class ");
    }
}
class Fibo2 extends Fibo1
{
    void series (int n)
    {
        int a = 0;
        int b =1;
       // super.series();
        System.out.println("fibo2 series is ");
        for(int i =1;i<=n;i++)
        {
            System.out.println(a + "");
            int x = a+b;
            a=b;
            b=x;
        }
    }
}
public class Fibonacii {
    public static void main(String[] args) {
        Fibo2 f = new Fibo2();
        f.series(5);
        f.series1();

    }
}
