public interface InterDemo1 {
    public void square(int n);
}

class Test1
{
    public static void main(String[] args) {
        InterDemo1 iref1 =(n)-> System.out.println(n*n);
        iref1.square(5);
        iref1.square(3);
    }
}