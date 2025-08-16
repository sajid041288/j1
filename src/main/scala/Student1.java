class Student {
    private  String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Student1
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sajid");
        s1.setRollno(1);
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());

    }
}