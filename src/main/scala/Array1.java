public class Array1 {

    public static void main(String[] args) {
        int sumE = 0;
        int sumO = 0;
        int a[] = {1, 3, 4, 6, 8, 9};
        for (int i = 5; i >= 1; i--) {
            if (a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }

         else
         {
                sumO = sumO + a[i];

         }

        }
        System.out.println("Even " +sumE);
        System.out.println("Odd " +sumO);
    }

}