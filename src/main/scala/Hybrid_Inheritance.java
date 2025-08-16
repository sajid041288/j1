class GP{
    void gp()
    {
        System.out.println("you are in GP class");
    }
}
class P extends GP
{
    void p()
    {
        System.out.println("you are in P class");
    }
}
class C1 extends P {
    void c1() {
        System.out.println("you are in c1 class");
    }
}
class C2 extends P
{
    void c2()
    {
        System.out.println("you are in c2 class");
    }
}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        C1 obj1 = new C1();
        C2 obj2 = new C2();
        obj1.c1();
        obj2.c2();
        obj1.p();
        obj1.gp();

    }
}
