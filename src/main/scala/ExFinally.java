public class ExFinally {
    public static void main(String[] args) {
        try{
            int  a[] = {1,2,3,4,5};
            System.out.println(a[0]);
        } catch (Exception e) {
            System.out.println("exception aught");
        }

       finally{
            System.out.println("finally always executed");
        }
    }
}
