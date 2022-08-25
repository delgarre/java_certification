package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args) {

//        Exercise 9 — Calculate order average payment placed on 14-Mar-2021
//        In addition to total sum, stream API offers operation for average value calculation as well.
//        You might find that the return data type is different from sum() as it is an Optional data type.
//        The reason is that the data stream would be empty and so calculation won’t output an average value for an empty data stream.

        LocalDate orderdate4 = LocalDate.of(2021, 3, 15);
        LocalDate deliverydate4 = LocalDate.of(2021, 4, 15);

        Order order4 = new Order(4, orderdate4, deliverydate4, "delivered");

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);

        order4.setProducts(productList);

        List<Order> orders = new ArrayList<>();

        orders.add(order4);

        Double result = orders
                .stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(p -> p.getPrice())
                .average().getAsDouble();
        System.out.println(result);


    }
}
