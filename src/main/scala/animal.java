public interface animal {
    void type();
}

class child implements animal
{
    public void type()
    {
        System.out.println("hello");
    }
}
class  Annonymous {

    public static void main(String[] args) {
        animal a = new child();
//        animal a = new animal() {
//            @Override
//            public void type() {
//
//            }
//        };

        a.type();
    }
}