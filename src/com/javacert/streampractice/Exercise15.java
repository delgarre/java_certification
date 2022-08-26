package com.javacert.streampractice;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise15 {
    public static void main(String[] args) {
//        Exercise 15 — Get the most expensive product by category
//        Similar to data transformation using Collectors.mapping(),
//        Collectors.maxBy() helps to obtain the record with max value as part of data map construction.
//        By providing a comparator for product price, maxBy() is able to get the product with the largest value for each category.

        Product product = new Product(1,"Diary of a wimpy kid", "Books", 50.00);
        Product product2 = new Product(1,"Harry Potter", "Books", 1000.00);
        Product product3 = new Product(1,"Goosebumps", "Books", 150.00);

        Set<Product> productList = new HashSet<>();

        productList.add(product);
        productList.add(product2);
        productList.add(product3);

        Map<String, Optional<Product>> result = productList
                .stream()
                .collect(
                        Collectors.groupingBy(Product::getCategory,
                                Collectors.maxBy(Comparator.comparing(Product::getPrice)))
                );

        System.out.println(result);

    }
}
