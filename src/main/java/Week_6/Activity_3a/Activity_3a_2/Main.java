package Week_6.Activity_3a.Activity_3a_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    //Sorting elements based on their length using by implementing comparator
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mango");
        list.add("apple");
        list.add("sugar-cane");
        list.add("sugar-cane");
        list.add("banana");

        Collections.sort(list, Comparator.comparingInt(String::length));

        System.out.println("Sorted list of fruits:");
        list.forEach((p)-> System.out.println(p));
    }
}
