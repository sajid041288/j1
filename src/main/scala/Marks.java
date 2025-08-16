import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marks = 80;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        marks =sc.nextInt();
        if (marks>90)
        {
            System.out.println("grade A");
        }
        else if (marks>70)
        {
            System.out.println("grade B");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
