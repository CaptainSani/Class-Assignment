package Week_7.Activity_2a;

public class ThreadEx_1 extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is currently running...");
    }

    public static void main(String[] args) {
        ThreadEx_1 threadEx1 = new ThreadEx_1();

        threadEx1.start();
    }
}