package Week_6.Peer_To_Peer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();

        List<Float> price = new ArrayList<>();

        product.add(new Product(1,"Car",10000));
        product.add(new Product(2,"Bike",15000));
        product.add(new Product(3,"Boat",20000));
        for (Product value: product){
            price.add(value.price);

        }



//        Optional<Float> min = product.stream().map(Product::price).min(Float::compareTo);
//        min.ifPresentOrElse(
//                minValue -> System.out.println("Minimum price: " + minValue),
//                () -> System.out.println("List is empty")
//        );
//
//        Optional<Float> max = price.stream().max(Float::compareTo);
//        max.ifPresentOrElse(
//                maxValue -> System.out.println(maxValue),
//                () -> System.out.println("list empty")
//        );

//        price = product.stream()
//                .filter(p -> p.price < 30000F)
//                .map(newP -> newP.price)
//                .collect(Collectors.toList());
//        System.out.println(price);
    }
}
