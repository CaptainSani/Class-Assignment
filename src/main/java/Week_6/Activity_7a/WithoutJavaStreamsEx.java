package Week_6.Activity_7a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutJavaStreamsEx {

    public static void main(String[] args) {

        List<Product> type = new ArrayList<>();

        List<Float> priceList = new ArrayList<>();

        type.add(new Product(1,"iPhone",25000F));
        type.add(new Product(2,"Lx 570",30000F));
        type.add(new Product(3,"Suzuki",95000F));
        type.add(new Product(4,"PlayStation 5",5000F));

//         type.forEach((p) -> System.out.println(p));
//
//        for(Product p : type){
//            if(p.price < 30000F){
//                priceList.add(p.price);
//            }
//        }

        priceList = type.stream()
                        .filter(p -> p.price < 30000F)
                                    .map(newP -> newP.price)
                                        .collect(Collectors.toList());
        System.out.println(priceList);


    }
}
