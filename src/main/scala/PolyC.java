import java.util.Scanner;

public class PolyC {

    void cal(int a, float b)
    {
        System.out.println("sum "+(a+b));
    }
    void cal(float d, int c)
    {
        System.out.println("sub "+(c-d));
    }
    void cal (float b,float d)
    {
        System.out.println("mul " +(b*d));
    }
    void cal (int a,int c)
    {
        if(c==0)
        {
            System.out.println("not divisible by 0");
        }
        else{
            System.out.println("div "+(a/c));
        }

    }
    // Method overloading, early binding , static binding, compile time polymorphism
    public static void main(String[] args) {
        int a,c;
        float b,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b,c,d");
        a = sc.nextInt();
        b =sc.nextFloat();
        c =sc.nextInt();
        d=sc.nextFloat();

       PolyC p = new PolyC();
        p.cal(a,b);
        p.cal(a,c);
        p.cal(b,d);
        p.cal(d,c);

    }
}