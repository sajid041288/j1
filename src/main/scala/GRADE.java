import java.util.Scanner;

public class GRADE {
    public static void main(String[] args) {
        int Physics, Chemistry, Biology, Mathematics , Computer;
            Scanner sc = new Scanner(System.in);
        System.out.println("enter subjects");
            Physics =sc.nextInt();
            Chemistry=sc.nextInt();
            Biology=sc.nextInt();
            Mathematics=sc.nextInt();
            Computer=sc.nextInt();
        int Percentage=(Physics+Chemistry+Biology+ Mathematics+ Computer )*100/5;

    if(Percentage >= 90)
        {
        System.out.println("Grade A");
        }
        else if(Percentage >= 80)
        {
            System.out.println("Grade B");
        }
        else if(Percentage >= 70)
        {
            System.out.println("Grade C");
        }
        else if(Percentage >= 60)
        {
            System.out.println("Grade D");
        }
        else if(Percentage >= 40)
        {
            System.out.println("Grade D");
        }
        else if(Percentage < 40)
        {
            System.out.println("Grade F");
        }
    }
}
