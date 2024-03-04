package Week_7.Activity_1a;

public class ThreadStateEx implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invokes the method join(); on thread t2 - "+ ThreadStateDemo.t1.getState());

        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
