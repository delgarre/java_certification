package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise13 {
    public static void main(String[] args) {
//        Exercise 13 — Produce a data map with order record and product total sum
//        The data map output this time is not a simple extraction of data fields from the stream, you need to
//        create a sub-stream for each order in order to calculate the product total sum.
//        Since, the key element is the order record itself instead of an order id, so Function.identity() is used to tell Collectors.toMap()
//        to use the data element as the key.

        LocalDate orderdate1 = LocalDate.of(2021, 2, 13);
        LocalDate deliverydate1 = LocalDate.of(2021, 4, 13);
        LocalDate orderdate2 = LocalDate.of(2018, 8, 17);
        LocalDate deliverydate2 = LocalDate.of(2018, 9, 3);
        LocalDate orderdate3 = LocalDate.of(2019, 3, 21);
        LocalDate deliverydate3 = LocalDate.of(2019, 5, 22);
        LocalDate orderdate4 = LocalDate.of(2021, 3, 15);
        LocalDate deliverydate4 = LocalDate.of(2021, 4, 15);
        LocalDate orderdate5 = LocalDate.of(2016, 8, 17);
        LocalDate deliverydate5 = LocalDate.of(2016, 9, 3);

        Order order1 = new Order(1, orderdate1, deliverydate1, "delivered");
        Order order2 = new Order(2, orderdate2, deliverydate2, "delivered");
        Order order3 = new Order(3, orderdate3, deliverydate3, "delivered");
        Order order4 = new Order(4, orderdate4, deliverydate4, "delivered");
        Order order5 = new Order(5, orderdate5, deliverydate5, "delivered");

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Product product4 = new Product(1,"Music", "Entertainment", 250.00);
        Product product5 = new Product(1,"Code source", "Books", 100.00);
        Product product6 = new Product(1,"Cheese", "Food", 30.00);

        Set<Product> productList = new HashSet<>();
        Set<Product> productList2 = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList2.add(product4);
        productList2.add(product5);
        productList2.add(product6);
        order1.setProducts(productList2);
        order4.setProducts(productList);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
//        orders.add(order2);
//        orders.add(order3);
        orders.add(order4);
//        orders.add(order5);

        Map<Order, Double> result = orders
                .stream()
                .collect(
                        Collectors.toMap(
                                Function.identity(),
                                order -> order.getProducts().stream()
                                        .mapToDouble(p -> p.getPrice()).sum()
                        )
                );

       result.keySet().stream().forEach(order -> {
           System.out.println(order.getId());
           System.out.println(result);
       });
    }
}
