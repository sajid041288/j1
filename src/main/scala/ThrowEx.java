public class ThrowEx {
    void avg()
    {
        try{
            throw new ArithmeticException();

        } catch (Exception e) {
            System.out.println("exception caught");
        }
    }

    public static void main(String[] args) {
        ThrowEx t = new ThrowEx();
        t.avg();
    }
}
