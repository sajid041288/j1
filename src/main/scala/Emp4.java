public class Emp4 {
    double salary;
    String name;
    int age ;
Emp4(int age, String name, double salary)
{
    this.age = age;
    this.salary = salary;
    this.name =name;
}
//public String toString()
//{
//    return "name is " +name+ " age is " +age+ " salary is " +salary;
//}

    public static void main(String[] args) {
Emp4 e1 = new Emp4(18,"sajid",102.999);
        System.out.println(e1.age);
    }
}
