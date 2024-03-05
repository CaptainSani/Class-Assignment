package Week_7.Activity_5a;

public class DaemonThreadEx extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("DAEMON THREAD IS PRESENT");
        }else{
            System.out.println("User thread is present");
        }
    }

    public static void main(String[] args) {
        DaemonThreadEx t1 = new DaemonThreadEx();
        DaemonThreadEx t2 = new DaemonThreadEx();
        DaemonThreadEx t3 = new DaemonThreadEx();

        t1.setDaemon(true);
        t2.setDaemon(true);


        t1.start();
        t2.start();
        t3.start();
    }
}
