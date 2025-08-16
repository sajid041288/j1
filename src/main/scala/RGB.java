import java.util.Scanner;

public class RGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the color \nR\nG\nB");
        char color = sc.next().charAt(0);
        switch (color)
        {
            case 'R': System.out.println("RED");
            break;
            case 'G': System.out.println("GREEN");
            break;
            case 'B': System.out.println("BLUE");
            break;
            default: System.out.println("invalid input");
            break;
        }
    }
}
