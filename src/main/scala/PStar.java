public class PStar {

    public static void main(String[] args) {
        int row = 5;
        for (int i= row-1; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= row; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= row - i; k++) {
                System.out.print("5 ");
            }
            System.out.println();
        }

        }
    }
