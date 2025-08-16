import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
int c,ch;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a & b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter choice \n1. add\n2.sub\n3.mul\n4.div");
        ch = sc.nextInt();
switch(ch)
{
    case 1: c=a+b;
        System.out.println(c);
        break;
    case 2: c=a-b;
        System.out.println(c);
        break;
    case 3: c=a*b;
        System.out.println(c);
        break;
    case 4: c=a/b;
        System.out.println(c);
        break;
    default:
        System.out.println("invalid choice");
        break;
}


    }
}
