interface test{
    void t();
void t1();
    default void t2()
    {
        System.out.println("Default method");
    }
    static void t3()
    {
        System.out.println("Static Method");
    }

}
class Demo implements  test
{
public void t()
{
    System.out.println("interface1");
}
    public void t1()
    {
        System.out.println("interface2");
    }

}


public class Interface {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.t();
        d.t1();
        d.t2();
        test.t3();
    }
}
