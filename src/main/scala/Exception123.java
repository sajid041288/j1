

public class Exception123 {
    void divide() throws Exception{
        try {
            int c = 10 / 2;
            System.out.println(c);
            throw new ArithmeticException();
        }
        catch (Exception e)
        {
            System.out.println("caught");
        }
        finally
        {
            System.out.println("run finally");
        }
    }

    public static void main(String[] args) {
        {
            try
            {
                Exception123 ex = new Exception123();
                ex.divide();
                int d = 10/0;
                System.out.println("done1");
            }
            catch (Exception e)
            {
                System.out.println("caught in 2");
            }
        }
    }
}