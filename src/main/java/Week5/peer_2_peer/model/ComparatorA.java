package Week5.peer_2_peer.model;

import java.util.Comparator;

public class ComparatorA implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        if (o1.isOld() && !o2.isOld()) {
            return -1;
        } else if (!o1.isOld() && o2.isOld()) {
            return 1;
        } else if (o1.isYoung() && !o2.isYoung()) {
            return -1;
        } else if (!o1.isYoung() && o2.isYoung()) {
            return 1;
        } else {
            return 0;
        }
    }
}