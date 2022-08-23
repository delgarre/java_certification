package com.javacert.streampractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {

//        Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
//        This exercise illustrates the usage of flatMap(). You can firstly start from an order list and then filter the list by customer tier and order date. Next,
//        get the product list from each order record and use flatMap() to emit product records into the stream.
//        For example, if we have 3 order records and each order contains 10 products,
//        then flatMap() will emit 10 data elements for each order record, resulting in 30 (3 x 10) product record output in the stream.
//
//        Since product list would contain duplicated product records if multiple orders would include the same product.
//        In order to generate a unique product list, applying distinct() operation can help to produce the unique list

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Order order = new Order();


        product.setName("Diary of a wimpy kid");
        product.setCategory("Toys");
        product.setPrice(50.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        order.setProducts(productList);
        List<Order> orders = new ArrayList<>();
        orders.add(order);

        List<Product> result = orders
                .stream()
                .filter(o -> o.getCustomer().getTier() ==2)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2022, 2, 1)) >=0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2022, 4, 1)) <=0)
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

    }
}
