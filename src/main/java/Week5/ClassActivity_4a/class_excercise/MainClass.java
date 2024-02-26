package Week_4.ClassActivity_4a.class_excercise;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book(1,"House of Dragons","sani dogo",2);
        Book book2 = new Book(2,"Vikings","sani dogo",2);
        Book book3 = new Book(3,"Th Last Kingdom","sani dogo",2);
        Book book4 = new Book(4,"Game of Thrones","sani dogo",2);
        Book book5 = new Book(5,"Merlin","sani dogo",2);


        HashMap<Integer, Book> map = new HashMap<>();

        map.put(1,book1);
        map.put(2,book2);
        map.put(3,book3);
        map.put(4,book4);
        map.put(5,book5);

        for(Map.Entry f : map.entrySet()){
           System.out.println(f.getKey()+" "+f.getValue());
        }
    }
}
