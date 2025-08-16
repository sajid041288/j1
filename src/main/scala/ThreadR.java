public class ThreadR implements Runnable {
    public void run()
    {
        System.out.println("runnable");}

    public static void main(String[] args) {
        ThreadR r = new ThreadR();
        Thread t = new Thread(r);
        t.start();
    }
}
