package Week_7.Activity_1a;

public class ThreadStateDemo implements Runnable{

    public static Thread t1;
    public static ThreadStateDemo obj;


    public static void main(String[] args) {

        obj = new ThreadStateDemo();
        t1 = new Thread(obj);

        System.out.println("the state of thread t1 after spawning it -"+ t1.getState());

        //invoking the start method on thread t1
        t1.start();


        System.out.println("the state of thread t1 afetr invoking the method start(); on it-"+ t1.getState());
    }

    @Override
    public void run() {
        ThreadStateEx threadStateEx = new ThreadStateEx();
        Thread t2 = new Thread(threadStateEx);

        //Thread t2 is created and it is currently in the new state.
        System.out.println("The state of thread t2 after spawning it -"+ t2.getState());
        t2.start();

        //Thread t2 is moved to the runnable state
        System.out.println("the sate of thread t2 after calling the start(); method on it -"+ t2.getState());

        //try-catch block for the smooth flow of the program.
        try{
            //Moving the thread t1 to the timed waiting state.
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The state of thread t2 after invoking the sleep(); method on it -"+ t2.getState());

        try{
            //waiting for thread t2 to completes its execution
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("the state of thread t2 when it has compiled its execution -"+ t2.getState());
    }
}
