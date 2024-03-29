package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {


//        Exercise 2 — Obtain a list of order with products belong to category “Baby”
//        You need to start from the data flow from the order entities and then check if order’s products belong to the category
//        “Baby”. Hence, the filter logic looks into the products stream of each
//        order record and use anyMatch() to determine if any product fulfill the criteria.

        LocalDate orderdate1 = LocalDate.of(2017, 1, 13);
        LocalDate deliverydate1 = LocalDate.of(2017, 1, 13);
        Order order = new Order(1, orderdate1, deliverydate1, "delivered");

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);;

        product.setName("Diary of a wimpy kid");
        product.setCategory("Books");
        product.setPrice(50.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);


        order.setProducts(productList);
        List<Order> orders = new ArrayList<>();
        orders.add(order);

        List<Order> result = orders
                .stream()
                .filter(o ->(
                    o.getProducts()
                            .stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Books"))
                )).collect(Collectors.toList());
        result.forEach(order1 -> {
            System.out.println(result.size());
        });
    }
}
