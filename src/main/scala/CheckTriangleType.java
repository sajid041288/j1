import java.util.Scanner;

public class CheckTriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side x,y & z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x + y > z && y + z > x) ;
        {
            System.out.println("it is a triangle");
        }
        if (x == y && y == z ) {
            System.out.println("triangle Equilateral");
        }
        else if (x == y || y==z ||x==z) {
            System.out.println("Isosceles  triangle");
        } else
        {
            System.out.println("Scalene triangle");
        }
    }
}