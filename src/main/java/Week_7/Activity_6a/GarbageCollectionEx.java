package Week_7.Activity_6a;

public class GarbageCollectionEx{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollectionEx g1 = new GarbageCollectionEx();
        GarbageCollectionEx g2 = new GarbageCollectionEx();

        g1 = null;
        g2 = null;

        System.gc();
    }
}
