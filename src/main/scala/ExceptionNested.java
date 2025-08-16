public class ExceptionNested {

    void arr() throws ArrayIndexOutOfBoundsException {
        try {
            int a[] = {1, 2, 3, 4, 5};
            System.out.println(a[1]);

             try
                {
                int b[] = {6, 7, 8, 9, 10};
                System.out.println(b[11]);
                }
            catch (Exception e)
            {
                System.out.println("Array exception caught");
                throw new ArrayIndexOutOfBoundsException();
            }

        }
        catch (Exception e)
        {
            System.out.println("Array exception caught 2");
            throw new ArrayIndexOutOfBoundsException();
        }

        finally {
            System.out.println("finally always execute");
        }

    }

    public static void main(String[] args) {
        ExceptionNested en = new ExceptionNested();
        en.arr();
        System.out.println("done");

    }
}