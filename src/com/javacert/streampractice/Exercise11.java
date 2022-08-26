package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise11 {
    public static void main(String[] args) {
//        Exercise 11 — Obtain a data map with order id and order’s product count
//        Except for value calculation, all previous exercises just output a record list.
//        The helper class Collectors provide a number of useful operations for data consolidation and data collection output.
//        Let’s check out the exercise to create a data map with order id as the key while the associated value is product count.
//        The terminal operation Collectors.toMap() accepts two arguments for your specify the key and value respectively.

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

        Map<Integer, Integer> result = orders
                .stream()
                .collect(
                        Collectors.toMap(
                                order -> order.getId(),
                                order -> order.getProducts().size()
                        )
                );

        System.out.println(result);
    }
}
