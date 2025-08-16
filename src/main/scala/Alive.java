public class Alive  extends Thread{
    public void run()
    {
        System.out.println("seed");
        try{
            Thread.sleep(10000);
           // System.out.println("info1");
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("info 2");
    }

    public static void main(String[] args) {
        Alive a=new Alive();
        a.start();

    }
}
