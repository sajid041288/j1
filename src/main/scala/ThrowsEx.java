public class ThrowsEx {
    void avg () throws ArithmeticException
    {
        System.out.println("inside check");
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        try{
            ThrowsEx ts = new ThrowsEx();
            ts.avg();
        }
        catch(Exception ae)
        {
            System.out.println("caught "+ae);
        }
    }
}
