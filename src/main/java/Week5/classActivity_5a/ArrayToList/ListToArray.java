package Week5.classActivity_5a.ArrayToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("mango");
        list.add("banana");

        for( String print : list){
            System.out.println("List: "+ print);
        }

        String[] array = list.toArray(new String[0]);

            System.out.println("Array: "+ Arrays.toString(array));

    }

}
