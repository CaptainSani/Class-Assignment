package Week_4.ClassActivity_4a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1,"apple");
        fruits.put(2,"banana");
        fruits.put(3,"paw-paw");
        fruits.put(4,"carrot");
        fruits.put(5,"orange");


        //fruits.remove(2,"banana");
        //fruits.replace(2,"date");

        System.out.println(fruits.containsKey(1));


//        for(Map.Entry f : fruits.entrySet()){
//            System.out.println(f.getKey()+" "+f.getValue());
//        }
    }
}
