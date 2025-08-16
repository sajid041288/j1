import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {

        int maths,phy,chem ,total;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter maths,phy,chem,total");
        maths=sc.nextInt();
        phy =sc.nextInt();
        chem=sc.nextInt();
        total =sc.nextInt();

        if(maths>=65)
        {
            if(phy>=55)
            {
                if(chem>=50)
                {
                    if(total>=180)
                    {
                        System.out.println("eligible");
                    }
                }
            }
        }
        System.out.println("not eligible");
    }
}
