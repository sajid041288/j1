public interface InterDemo {
    public void m1();
}
class Test
{
    public static void main(String[] args) {
        InterDemo iref = ()-> System.out.println("hello");
        iref.m1();
    }
}