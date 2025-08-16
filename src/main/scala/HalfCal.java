import java.util.Scanner;

 class Halffaultycal {
    public static void main(String[] args) {

                double x,y,operator,result;
                Scanner sc=new Scanner(System.in);
                System.out.print( "choose the operator: +,-,*,/");
                operator=sc.next().charAt(0);
                System.out.print( "enter the x: ");
                x=sc.nextDouble();
                System.out.print( "enter the y: ");
                y=sc.nextDouble();

                if( x==45 && y==3 && operator=='*') {
                    result=555;
                    System.out.print("multipliction is: "+result);
                }
                else if(x==56 && y==9 && operator=='+') {
                    result = 77;
                    System.out.print("addition is: " +result);
                }
                else if(x==56 && y==6 && operator=='/') {
                    result = 4;
                    System.out.print("Divide is: " +result);
                }

                            else if(operator=='+') {
                                result=x+y;
                                System.out.print("addition is: "+result);
                            }
                            else if(operator=='-') {
                                result=x-y;
                                System.out.print("sub is: "+result);
                            }
                            else if(operator=='*') {
                                result=x*y;
                                System.out.print("mul is: "+result);
                            }
                            else if(operator=='/') {
                                result=x/y;
                                System.out.print("division is: "+result);
                            }



                        }
                    }


