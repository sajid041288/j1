import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit;
        double bill ;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter unit");
        unit = sc.nextInt();
        if (unit <=50)
        {
            bill =(50*0.50);

            System.out.println("electricity" +bill);

        }
        if (unit >=51 && unit <=150)
        {
            bill =(50*0.50)+(100*0.75);
            System.out.println("electricity" +bill);
        }
        if (unit >=151 && unit <=250)
        {
            bill =(50*0.50)+(100*0.75)+(100*1.2);
            System.out.println("electricity" +bill);
        }
        else if(unit >250)
        {
            bill =250*1.5+(250*1.5)*0.2;
            System.out.println("electricity" +bill);
        }

    }
}
