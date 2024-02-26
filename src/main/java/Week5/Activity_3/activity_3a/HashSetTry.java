package Week5.Activity_3.activity_3a;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetTry {
    public static void main(String[] args) {
        HashSet<String> numbers = new HashSet<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("five");
        numbers.remove("one");


        HashSet<String>numbers2 = new HashSet<>();
        numbers2.add("one");
        numbers2.add("six");
        numbers2.add("seven");

        numbers.addAll(numbers2);

//
//        Iterator<String> iterator = numbers.iterator();
//
//        while(iterator.hasNext()){
//
//            System.out.println(iterator.next());
//        }

        //WHEN USING ADVANCED FOR LOOP, NO NEED FOR THE ITERATOR.
        for(String nums : numbers){
            System.out.println(nums);
        }
    }
}
