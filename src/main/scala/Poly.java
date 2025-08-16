public class Poly {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
// Method overloading, early binding , static binding, compile time polymorphism
    public static void main(String[] args) {
        Poly p = new Poly();
        p.sum(1,2,3);
        p.sum(1,2);
    }
}
