public class HollowR {
    //public static void main(String[] args) {

    public static void star(int n) {
        int i;
        int j;

        for (i = 0; i <n; i++) {
            //System.out.println("*");
            for (j = 0; j <n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        star(n);
    }

}