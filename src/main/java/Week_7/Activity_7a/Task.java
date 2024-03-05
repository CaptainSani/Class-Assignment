package Week_7.Activity_7a;

public class Task implements Runnable{

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Executing "+ name + " on thread" + Thread.currentThread().getName());

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + name);
    }
}
