
public class JoinThread extends Thread {
    public void run() {
        System.out.println("r1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("r2");
    }

    public static void main(String[] args) {
        JoinThread j = new JoinThread();
        JoinThread k = new JoinThread();
        j.start();
        try {
            j.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        k.start();
    }
}
