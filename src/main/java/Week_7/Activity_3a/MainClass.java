package Week_7.Activity_3a;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1,5),"thread-1");
        Thread t2 = new Thread(new NumberPrinter(6,10),"thread-2");


        t1.start();
        t2.start();
    }
}
