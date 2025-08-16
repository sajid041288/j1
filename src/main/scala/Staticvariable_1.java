public class Staticvariable_1 {
    static String companyName;
    static {
  companyName="JAVA";
    }
    int id ;
    String name;

void show()
{
    System.out.println(id+"" +name+ ""+companyName);
}

    public static void main(String[] args) {
        Staticvariable_1 s1 = new Staticvariable_1();
        s1.name="sajid";
        s1.id =1;
        s1.show();
    }
}