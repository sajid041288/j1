
interface InterDemo11
{
    public void square(int a);
    }

class Test11
{
    public static void main(String[] args) {
        InterDemo11 iref1 =(n)-> System.out.println(n*n);
        iref1.square(5);
        iref1.square(3);
    }
}