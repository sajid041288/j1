public class StaticDemo {

    static String company = "OpenAI"; // static variable

    static void showCompany() {       // static method
        System.out.println("Company: " + company);
    }

    static class Info {               // static nested class
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    public static void main(String[] args) {
        StaticDemo.showCompany();          // calling static method
        StaticDemo.Info info = new StaticDemo.Info(); // creating object of static class
        info.display();
    }
}
