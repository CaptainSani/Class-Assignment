package Week_6.Activity_3a;

import java.util.ArrayList;
import java.util.List;

public class LambdaXarrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("sani");
        list.add("dogo");
        list.add("master");
        list.add("shifu");

        list.forEach((p) -> System.out.println(p));
    }
}
