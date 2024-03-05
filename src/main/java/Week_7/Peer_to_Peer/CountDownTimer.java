package Week_7.Peer_to_Peer;

public class CountDownTimer extends Thread{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 10; i >= 0; i--){
            try{
                CountDownTimer.sleep(1000);
                System.out.println(t.getName() + " " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
