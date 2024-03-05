package Week_7.Peer_to_Peer;

public class MainClass {
    public static void main(String[] args) {
        CountDownTimer t1 = new CountDownTimer();

        t1.setName("Countdown:");
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Countdown complete!");
    }
}
