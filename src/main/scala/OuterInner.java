import javassist.runtime.Inner;

public class OuterInner {

    public void display()
    {
        Inner in = new Inner();
        in.show();
    }
    class Inner
    {
        public void show()
        {
            System.out.println("inside inner");
        }
    }

    public static void main(String[] args) {
        {
            OuterInner oi =new OuterInner();
            oi.display();
        }
    }
}
