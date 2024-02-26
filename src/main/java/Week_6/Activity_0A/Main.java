package Week_6.Activity_0A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Sani", 20));
        students.add(new Student("Isi", 18));
        students.add(new Student("Eva", 19));


        Collections.sort(students);

        students.forEach((p) -> System.out.println(p));


    }
}
