import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("calculator");
            System.out.println("1 : Addition");
            System.out.println("2 : Subtract");
            System.out.println("3 : multiply");
            System.out.println("4 : divide");

            while (true) {

                System.out.println("enter the choice");
                int choice = sc.nextInt();
                if (choice == 5) {
                    System.out.println("exit");
                    break;

                }

                System.out.println("enter num1");
                int num1 = sc.nextInt();
                System.out.println("enter num2");
                int num2 = sc.nextInt();
                double result = 0;
                boolean validOperation = true;
                switch (choice) {

                    case 1:
                        result = num1 + num2;
                        System.out.println("Add " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("sub " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("mul " + result);
                        break;

                    case 4:

                        if (num2!=0) {
                            result = num1 / num2;
                            System.out.println("divide "+ result);
                        }
                        else
                        {
                            System.out.println("number cannot divided");
                        }


                        break;
                    default:
                        System.out.println("invalid");
                        validOperation = false;


                }
                if(validOperation && choice != 5)
                {
                    System.out.println("Operation is successfully completed");
                }
            }
        }

    }

}
