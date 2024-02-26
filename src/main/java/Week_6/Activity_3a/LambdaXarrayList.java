package Week_6.Activity_3a;

import java.util.ArrayList;
import java.util.List;

public class LambdaXarrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Sani");
        list.add("Chi");
        list.add("Isi");
        list.add("Master");

        list.forEach((n) -> System.out.println(n));
    }
}
