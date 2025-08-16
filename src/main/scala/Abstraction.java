abstract class P1
{
    abstract void p1();
    abstract void p2();
    void q1()
    {
        System.out.println("concrete/normal/non abstract");
    }
    void q2 ()
    {
        String s = new String("Hello");
        System.out.println(s);
    }
}
class C11 extends P1{
    public void p1()
    {
        System.out.println("Abs Achieved");
    }
    public void p2()
    {
        int a = 10;
        System.out.println(a);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        C11 c1 = new C11();
        c1.p1();
        c1.q1();
        c1.p2();
        c1.q2();
    }
}
