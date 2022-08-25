package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {

//        Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
//        You can see that this exercise involves two actions — (1) write order records to the console and (2) produce a list of products.
//        Generating different output from a stream is not possible, how can we fulfill this requirement? Apart from running the stream flow twice,
//        operation peek() allows execution of system logic as part of a stream flow.
//        The sample solution runs peek() to write order records to the console right after data filtering,
//        then subsequent operations such as flatMap() will be executed for the output of product records.

        LocalDate orderdate1 = LocalDate.of(2017, 1, 13);
        LocalDate deliverydate1 = LocalDate.of(2017, 1, 13);
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

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        order4.setProducts(productList);

        List<Order> orders = new ArrayList<>();
//        orders.add(order1);
//        orders.add(order2);
//        orders.add(order3);
        orders.add(order4);
//        orders.add(order5);

        List<Product> result = orders
                .stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
                .peek(o -> System.out.println(o.toString()))
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        result.forEach(p -> System.out.println(p.getName()));

    }
}
