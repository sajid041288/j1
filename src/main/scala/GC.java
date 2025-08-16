public class GC {

    public void finalize()
    {
        System.out.println("obj is garbage collected");// method execute once in finalize before free obj
    }
    public static void main(String[] args) {
        GC g = new GC();
        g = null;
        System.gc();
        System.out.println("G collected");
    }
}
