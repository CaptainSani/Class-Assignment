package Week_4.ArrayList;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");

        Collections.sort(list1);     // this method sorts the array

        // System.out.println(list1);    //To print the elements

        for(String i : list1){
           System.out.println(i);
       }


    }
}
