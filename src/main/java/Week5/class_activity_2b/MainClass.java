package Week5.class_activity_2b;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person("sani", 20);
        Person p2 = new Person("izi", 18);
        Person p3 = new Person("master", 50);
        Person p4 = new Person("kanayo", 60);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Collections.sort(people, new AgeComparator());

        for (Person person : people){
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
}
