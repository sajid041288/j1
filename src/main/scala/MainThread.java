public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("seed");
        t.setPriority(8);
        System.out.println(t);
    }
}
