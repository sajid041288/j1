class  First1 {
    public void display(String s1) {
        System.out.print("[" + s1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("]");

    }

}
    class sec extends Thread {
        First1 f1;
        String s1;

        sec(First1 f1, String s1) {
            this.f1 = f1;
            this.s1 = s1;
            start();
        }

        public  void run () {
            synchronized(f1)
            {
                f1.display(s1);
            }
            }
        }

public class Syn {
    public static void main(String[] args) {
        First1 f1 = new First1();
        sec ss = new sec(f1,"Wel");
        sec ss1 =new sec(f1,"com");
        sec ss2 =new sec(f1,"home");
    }
}
