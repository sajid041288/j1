public class Student3 {
    int age;
    String name;
    Student3()
    {
        this.age = 0;
        this.name = "";

    }
//    public String toString()//default constructor
//    {
//        return "name is "+ name +" age is " +age;
//    }

    public static void main(String[] args) {
        {
            Student3 s1 = new Student3();
            s1.name ="sajid";
            s1.age = 18;
            //System.out.println(s1);
            System.out.println(s1.age);
            System.out.println(s1.name);
        }
    }
}
