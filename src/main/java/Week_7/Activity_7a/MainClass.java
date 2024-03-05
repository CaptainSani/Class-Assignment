package Week_7.Activity_7a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++ ){
            Runnable task = new Task("Task" + (i + 1));
            service.submit(task);
        }
        service.shutdown();
    }
}
