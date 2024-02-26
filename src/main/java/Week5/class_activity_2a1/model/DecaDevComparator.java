package Week5.class_activity_2a1.model;

import java.util.Comparator;

public class DecaDevComparator implements Comparator <DecaDevs>{


    @Override
    public int compare(DecaDevs d1, DecaDevs d2) {



        if (d1.isFemale() && !d2.isFemale()) {
            return -1;
        } else if (!d1.isFemale() && d2.isFemale()) {
            return 1;
        } else if (d1.isMale() && !d2.isMale()) {
            return -1;
        } else if (!d1.isMale() && d1.isMale()) {
            return 1;
        } else {
            return 0;
        }

    }
}