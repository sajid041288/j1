
class Parent
{
    void p()
    {
        System.out.println("parent class");
    }
}
class Child extends Parent
{
    void c()
    {
        System.out.println("child class");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.p();
        c1.c();
    }
}
