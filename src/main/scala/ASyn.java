
class  Second {
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
class Third extends Thread {
    Second second1;
    String s1;

    Third(Second second1, String s1) {
        this.second1 = second1;
        this.s1 = s1;
        start();
    }

    public  void run ()

        {
            second1.display(s1);
        }
    }


public class ASyn {
    public static void main(String[] args) {
        Second second = new Second();
        Third ss = new Third (second,"Wel");
        Third  ss1 =new Third (second,"com");
        Third  ss2 =new Third (second,"home");
    }
}
