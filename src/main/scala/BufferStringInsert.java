import java.util.Scanner;

public class BufferStringInsert {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s");
        s = sc.nextLine();

        StringBuffer sb = new StringBuffer(s);

        //sb.insert(2,"info");
        System.out.println(sb.capacity());
    }
}
