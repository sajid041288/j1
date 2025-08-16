
final class Constants1 {
    static final double PI = 3.14159;         // final variable

    final void displayMessage() {            // final method
        System.out.println("Cannot override this method.");
    }
}

public class Constants {
    public static void main(String[] args) {
        System.out.println("PI = " + Constants1.PI);

        Constants1 c = new Constants1();
        c.displayMessage();
    }
}