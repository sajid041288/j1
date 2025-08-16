class Emp_Data{
    private String ename;
    private double esal;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }
}


public class Emp {
    public static void main(String[] args) {
        Emp_Data e =new Emp_Data();
        e.setEname("sajid");
        e.setEsal(10000.555);
        System.out.println(e.getEname());
        System.out.println(e.getEsal());
    }
}
