import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height");
        double Height = sc.nextDouble();
        if (Height < 150.0) {
            System.out.println(" The person is Dwarf");
        } else if (Height >= 150.0 && Height < 165) {
            System.out.println("the person is  average heighted.");
        } else if (Height >= 165.0 && Height <= 195.0) {
            System.out.println("he person is taller");
        } else {
            System.out.println("Abnormal height.");
        }
    }
}