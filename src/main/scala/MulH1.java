interface arr1
{
    void ar1();
}
interface arr2
{
    void ar1();
}
interface arr3
{
    void ar2();
}
class MulIn implements arr1,arr2,arr3
{
    public void ar1()
    {
        int a [] =  {1,2,3,4} ;
        int b [] = {10, 20 ,30 };

        int c = a[1] + b[2];
        System.out.println(c);
    }
    public void ar2()
    {
        int a [] =  {1,2,3,4} ;
        int b [] = {10, 20 ,30 };

        int c = a[0] - b[1];
        System.out.println(c);
    }
    public void ar3()
    {
        int a [] =  {1,2,3,4} ;
        int b [] = {10, 20 ,30 };

        int c = a[1] * b[1];
        System.out.println(c);
    }
}

public class MulH1 {
    public static void main(String[] args) {
        MulIn m =new MulIn();
        m.ar1();
        m.ar2();
        m.ar3();
        System.out.println("Array Interface");
    }
}
