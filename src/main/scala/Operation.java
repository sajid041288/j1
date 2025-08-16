import java.util.Scanner;

public interface Operation {

    public void operation();

}

    class Lambda1 {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter a,b");
            int a =sc.nextInt();
            int b = sc.nextInt();
            Operation add = ()-> System.out.println(a+b);
            Operation sub = ()-> System.out.println(a-b);
            Operation mul = ()-> System.out.println(a*b);
            Operation div = ()-> System.out.println(a/b);

            add.operation();
            sub.operation();
            mul.operation();
            div.operation();
        }
    }

