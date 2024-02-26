package Week5.classActivity_5a.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("vivian");
        fruits.add("favor");



        for(String print : fruits){
            System.out.println(print);
        }
    }
}
