public class OuterInner1 {
    class Inner1
    {
        public void show()
        {
            System.out.println("inside the inner");
        }
    }

    public static void main(String[] args) {
        OuterInner1 ot =new OuterInner1();
        OuterInner1.Inner1 in = ot.new Inner1();
        in.show();
    }
}
