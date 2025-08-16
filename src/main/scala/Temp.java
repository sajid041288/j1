import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        double Temp = sc.nextDouble();
        if (Temp < 0 )
        {
            System.out.println("Freezing weather");
        }
        else if(Temp>0 && Temp<=10)
        {
            System.out.println("Very Cold weather");
        }
        else if (Temp>10 && Temp<=20)
        {
            System.out.println("Cold weather");
        }
        else if (Temp>20 && Temp<=30)
        {
            System.out.println("normal weather");
        }
        else if (Temp>30 && Temp<=40)
        {
            System.out.println("hot weather");
        }
        else if (Temp>40 )
        {
            System.out.println(" very hot weather");
        }

    }
}
