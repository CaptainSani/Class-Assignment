package Week5.peer_2_peer.model;

public class Person {
    private boolean isYoung;
    private boolean isOld;
    private String name;

    public Person(boolean isYoung, boolean isOld, String name) {

        this.isYoung = isYoung;
        this.isOld = isOld;
        this.name= name;
    }



    public boolean isYoung() {
        return isYoung;
    }

    public boolean isOld() {
        return isOld;
    }

    public String getName() {
        return name;
    }
}
