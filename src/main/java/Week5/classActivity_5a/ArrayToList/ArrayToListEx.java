package Week5.classActivity_5a.ArrayToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListEx {
    public static void main(String[] args) {

        String[] stack = {"Java",".Net","Node"};

        System.out.println("Array : "+ Arrays.toString(stack));

        System.out.println("************************");


        List<String> arrayList = new ArrayList<>();

        for(String items : stack){
            arrayList.add(items);
        }
        System.out.println("list : "+arrayList);


        //Short method
        List<String> items = new ArrayList<>(Arrays.asList(stack));
        System.out.println("list : "+Arrays.toString(stack));
    }
}
