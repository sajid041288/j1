import java.util.Scanner;

interface Calci1
{
   void add(int a,int b);
   void sub(int a ,int b);
}
interface Calci2
{
    void mul(int a, int b);
    void div(int a ,int b);
}
 class Demo11 implements Calci1,Calci2 {

     public void add(int a, int b) {
         System.out.println("Add " + (a + b));
     }

     public void sub(int a, int b) {
         System.out.println("sub " + (a - b));
     }

     public void mul(int a, int b) {
         System.out.println("mul " + (a * b));
     }

     public void div(int a, int b) {
         if (b == 0) {
             System.out.println("not divisible by 0");
         } else {
             System.out.println("div " + ( a /  b));
         }

     }
 }
public class MulInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
  Demo11 d  = new Demo11();
  d.add(a,b);
  d.sub(a,b);
  d.mul(a,b);
  d.div(a,b);
    }
}
