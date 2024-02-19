package Week5.class_activity_1a.ClassActivity_1a;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Abuja");
        cities.add("Qatar");
        cities.add("Canada");
        cities.add("London");
        cities.add("Dubai");

        Iterator<String> iterator = cities.iterator();

        while(iterator.hasNext()){
            String cityNames = iterator.next();
            System.out.println(cityNames);
        }
    }
}
